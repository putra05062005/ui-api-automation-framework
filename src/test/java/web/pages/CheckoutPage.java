package web.pages;

import common.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By successMsg = By.className("complete-header");
    By errorMsg = By.cssSelector("[data-test='error']");

    public CheckoutPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void fillForm() {

        wait.until(ExpectedConditions.urlContains("checkout-step-one"));

        WebElement first = wait.until(
                ExpectedConditions.visibilityOfElementLocated(firstName));

        first.clear();
        first.sendKeys("Pahala");

        WebElement last = wait.until(
                ExpectedConditions.visibilityOfElementLocated(lastName));

        last.clear();
        last.sendKeys("Test");

        WebElement zip = wait.until(
                ExpectedConditions.visibilityOfElementLocated(postalCode));

        zip.clear();
        zip.sendKeys("12345");

        System.out.println("First Name : " + first.getAttribute("value"));
        System.out.println("Last Name  : " + last.getAttribute("value"));
        System.out.println("Postal Code: " + zip.getAttribute("value"));
    }

    public void continueCheckout() {

        WebElement btn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(continueBtn));

        System.out.println("Button displayed : " + btn.isDisplayed());
        System.out.println("Button enabled   : " + btn.isEnabled());

        System.out.println("\n===== BUTTON HTML =====");
        System.out.println(btn.getAttribute("outerHTML"));

        try {
            btn.click();
        } catch (Exception e) {
            System.out.println("Normal click gagal, pakai JS Click");

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", btn);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n===== URL =====");
        System.out.println(driver.getCurrentUrl());

        if (!driver.findElements(errorMsg).isEmpty()) {
            System.out.println("\n===== ERROR =====");
            System.out.println(driver.findElement(errorMsg).getText());
        }

        System.out.println("\n===== PAGE HAS ERROR TEXT =====");
        System.out.println(driver.getPageSource().contains("Error"));

        wait.until(ExpectedConditions.urlContains("checkout-step-two"));
    }

    public void finishCheckout() {

        WebElement btn = wait.until(
                ExpectedConditions.elementToBeClickable(finishBtn));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", btn);

        wait.until(ExpectedConditions.urlContains("checkout-complete"));
    }

    public boolean isCheckoutSuccess() {

        try {
            return wait.until(
                    ExpectedConditions.or(
                            ExpectedConditions.urlContains("checkout-complete"),
                            ExpectedConditions.visibilityOfElementLocated(successMsg)
                    )
            ) != null;

        } catch (Exception e) {
            return false;
        }
    }
}
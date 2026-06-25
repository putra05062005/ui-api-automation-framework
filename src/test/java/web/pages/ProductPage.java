package web.pages;
import common.DriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");
    By cartBadge = By.className("shopping_cart_badge");

    public ProductPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void addProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();

        // pastikan masuk cart
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge));
    }

    public void goToCart() {

    WebElement cart = wait.until(
            ExpectedConditions.elementToBeClickable(cartIcon));

    try {
        cart.click();
    } catch (Exception e) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", cart);
    }

    wait.until(ExpectedConditions.urlContains("cart"));
}
}
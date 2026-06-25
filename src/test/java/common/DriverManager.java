package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            ChromeOptions options = new ChromeOptions();

            boolean isCI = System.getenv("CI") != null;

            // Headless hanya di GitHub Actions
            if (isCI) {
                options.addArguments("--headless=new");
            }

            // Chrome options
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-notifications");
            options.addArguments("--incognito");

            // Temporary profile (profil baru setiap test)
            String profile =
                    System.getProperty("java.io.tmpdir")
                            + "/chrome-profile-"
                            + System.currentTimeMillis();

            options.addArguments("--user-data-dir=" + profile);

            // Disable password manager
            options.setExperimentalOption("prefs", Map.of(
                    "credentials_enable_service", false,
                    "profile.password_manager_enabled", false
            ));

            driver = new ChromeDriver(options);
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
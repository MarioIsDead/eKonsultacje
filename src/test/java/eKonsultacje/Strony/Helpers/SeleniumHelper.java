package eKonsultacje.Strony.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

public class SeleniumHelper {

    public WebDriver driver;

    public SeleniumHelper (WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementToBeDisplayed (By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(10000))
                .ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementToBeLocated (By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(10000))
                .ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

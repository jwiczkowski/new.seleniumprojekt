package seleniumtests.Templates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jwiczkowski on 13.09.16.
 */
public class PageTamplate
{
    public static void waitFor(WebDriver driver, By by, long time)
    {
        long globalWaitTime = 10;
        WebDriverWait wait = new WebDriverWait(driver, globalWaitTime + time);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}

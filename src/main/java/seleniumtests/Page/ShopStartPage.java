package seleniumtests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumtests.Methods.InvoiceInformation;
import seleniumtests.Templates.PageTamplate;

import static org.openqa.selenium.By.id;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by jwiczkowski on 13.09.16.
 */
public class ShopStartPage extends PageTamplate
{
    public WebElement loginbutton(WebDriver driver)
    {
        try
        {
            WebElement loginbutton = driver.findElement(By.xpath("//span[@class='hidden-xs']"));
            return loginbutton;
        }
        catch (NoSuchElementException ex)
        {
            fail("Login button nicht gefunden");
            return null;
        }
    }
    public static WebElement emailLogin(WebDriver driver)
    {
        try
        {
            WebElement emailLogin = driver.findElement(id("checkout-login-inputEmail"));
            return emailLogin;
        }
        catch (NoSuchElementException ex)
        {
            fail("EmailLogin Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement passwortLogin(WebDriver driver)
    {
        try
        {
            WebElement passwortLogin = driver.findElement(id("checkout-login-password"));
            return passwortLogin;
        }
        catch (NoSuchElementException ex)
        {
            fail("Passwort Login Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement loginLoginClick(WebDriver driver)
    {
        try
        {
            WebElement loginLoginClick = driver.findElement(By.xpath("html/body/div[1]/nav/div/div[1]/ul/li[4]/ul/li[3]/a"));
            return loginLoginClick;
        }
        catch (NoSuchElementException ex)
        {
            fail(" Login Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement verifyStartPage (WebDriver driver)
    {
        try {

            assertEquals(driver.getTitle(), "Startseite", "Startseite nicht gefunden / geladen");
            return null;
        }
        catch (NoSuchElementException ex)
    {
        fail("Seite nicht geladen werden ");
        return null;
    }
}
}

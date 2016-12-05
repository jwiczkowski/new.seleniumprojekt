package seleniumtests.Page;

import org.openqa.selenium.*;
import seleniumtests.Templates.PageTamplate;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by jwiczkowski on 30.08.16.
 */
public class InvoiceInformationPage extends PageTamplate
{
    private static WebElement element;
    private static By registrationButton          = By.xpath("html/body/div[1]/div[2]/form/div[2]/button");
    private static By salutationDropDown          = By.id("registrationFormOfAddress");
    private static By registrationBirthDay        = By.id("registrationBirthDay");
    private static By registrationBirthMonth      = By.id("registrationBirthMonth");
    private static By registrationBirthYear       = By.id("registrationBirthYear");
    private static By registrationPassword        = By.id("registrationPassword");
    private static By registrationPasswordRepeat  = By.id("registrationPasswordRepeat");
    private static By registrationPhone           = By.id("registrationPhone");
    private static By registrationHouseNo         = By.id("registrationNumber");
    private static By registrationZip             = By.id("registrationZip");
    private static By registrationStreet          = By.id("registrationStreet");
    private static By registrationFirstName       = By.id("registrationFirstName");
    private static By registrationLastName        = By.id("registrationLastName");
    private static By registrationCity            = By.id("registrationCity");
    private static By registrationCountry         = By.id("registrationCountry");
    private static By registrationEmail           = By.id("registrationEmail");
    private static By registrationEmailRepeat     = By.id("registrationEmailRepeat");

    public WebElement regButton(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationButton, 10);
            element = driver.findElement(registrationButton);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Registrierung abschließen Button nicht gefunden");
            return null;
        }
    }

    public static WebElement selectSalutation(WebDriver driver)
    {
        try
        {
            waitFor(driver, salutationDropDown, 10);
            element = driver.findElement(salutationDropDown);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Anrede Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputBirthDay(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationBirthDay, 10);
            element = driver.findElement(registrationBirthDay);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Geburtstag Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputBirthMonth(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationBirthMonth, 10);
            element = driver.findElement(registrationBirthMonth);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Monat Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputYear(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationBirthYear, 10);
            element = driver.findElement(registrationBirthYear);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Jahr Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputPassword(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationPassword, 10);
            element = driver.findElement(registrationPassword);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Passwort Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputPasswordRepeat(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationPassword, 10);
            element = driver.findElement(registrationPasswordRepeat);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Passwort wiederholen Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputphoneNum(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationPhone, 10);
            element = driver.findElement(registrationPhone);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Telefonnummer Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputHouseNo(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationHouseNo, 10);
            element = driver.findElement(registrationHouseNo);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Hausnummer Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputZip(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationZip, 10);
            element = driver.findElement(registrationZip);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("PLZ Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputStreet(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationStreet, 10);
            element = driver.findElement(registrationStreet);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail(" Straße Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputFirstName(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationFirstName, 10);
            element = driver.findElement(registrationFirstName);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Vorname Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputLastName(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationLastName, 10);
            element = driver.findElement(registrationLastName);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Nachname Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputCity(WebDriver driver)
    {

        try
        {
            waitFor(driver, registrationCity, 10);
            element = driver.findElement(registrationCity);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Ort Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement selectCountry(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationCountry, 10);
            element = driver.findElement(registrationCountry);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Land Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputEmail(WebDriver driver)
    {
        try
        {
            waitFor(driver, registrationEmail, 10);
            element = driver.findElement(registrationEmail);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Email Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputEmailRepeat(WebDriver driver)
    {
        try
        {
            element = driver.findElement(registrationEmailRepeat);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Email wiederholen Feld nicht gefunden");
            return null;
        }
    }
}

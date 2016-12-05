package seleniumtests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumtests.Templates.PageTamplate;

import static org.testng.Assert.fail;

/**
 * Created by jwiczkowski on 13.09.16.
 */

public class MyAccountCustomerPage extends PageTamplate
{
    private static WebElement element;
    private static By CustomerInformation              = By.id("PlentyWebMyAccountCustomerContainerTitle");
    private static By changeCustomerInformation        = By.id("button_changePlentyWebMyAccountCustomerPersonalData");
    private static By CustomerSalutation               = By.id("PlentyWebUpdateCustomerDetailsSalutation");
    private static By CustomerFirstName                = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputFirstName");
    private static By CustomerLastName                 = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputLastName");
    private static By CustomerStreet                   = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputStreet");
    private static By CustomerHouseNo                  = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputHouseNo");
    private static By CustomerAdressAdditional         = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputAddressAdditional");
    private static By CustomerZip                      = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputZipCode");
    private static By CustomerCity                     = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputCity");
    private static By CustomerCountry                  = By.id("PlentyWebUpdateCustomerDetailsCountry");
    private static By CustomerPhoneNum                 = By.id("PlentyWebMyAccountUpdateCustomerContactInputFon");
    private static By CustomerBirthDay                 = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputBirthday");
    private static By CustomerBirthMonth               = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputBirthmonth");
    private static By CustomerBirthYear                = By.id("PlentyWebMyAccountUpdateCustomerDetailsInputBirthyear");


    public static WebElement customerInformationButton(WebDriver driver)
    {
        try
        {
            waitFor(driver,CustomerInformation,10);
            element = driver.findElement(CustomerInformation);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Kundendaten Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement changeDataButton(WebDriver driver)
    {
        try
        {
            waitFor(driver,changeCustomerInformation,10);
            element = driver.findElement(changeCustomerInformation);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Kundendatenändern Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement salutationDropdown(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerSalutation,10);
            element = driver.findElement(CustomerSalutation);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Anrede änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputFirstName(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerFirstName,10);
            element = driver.findElement(CustomerFirstName);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Vorname änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputLastName(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerLastName,10);
            element = driver.findElement(CustomerLastName);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Nachname änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputStreet(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerStreet,10);
            element = driver.findElement(CustomerStreet);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Straßen änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputHouseNo(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerHouseNo,10);
            element = driver.findElement(CustomerHouseNo);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Hausnummer änderungs Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement inputAdressAdditional(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerAdressAdditional,10);
            element = driver.findElement(CustomerAdressAdditional);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Adresszusatz änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputZip(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerZip,10);
            element = driver.findElement(CustomerZip);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("PLZ änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement inputCity(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerCity,10);
            element = driver.findElement(CustomerCity);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Ort änderungs Feld nicht gefunden");
            return null;
        }
    }

    public static WebElement countryDropdown(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerCountry,10);
            element = driver.findElement(CustomerCountry);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Land änderungs Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement inputPhoneNum(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerPhoneNum,10);
            element = driver.findElement(CustomerPhoneNum);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Telefonnummer änderungs Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement inputBirthDay(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerBirthDay,10);
            element = driver.findElement(CustomerBirthDay);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Geburtstag änderungs Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement inputBirthMonth(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerBirthMonth,10);
            element = driver.findElement(CustomerBirthMonth);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Geburtsmonat änderungs Feld nicht gefunden");
            return null;
        }
    }
    public static WebElement inputBirthYear(WebDriver driver)
    {
        try
        {
            waitFor(driver, CustomerBirthYear,10);
            element = driver.findElement(CustomerBirthYear);
            return element;
        }
        catch (NoSuchElementException ex)
        {
            fail("Geburtsjahr änderungs Feld nicht gefunden");
            return null;
        }
    }

}

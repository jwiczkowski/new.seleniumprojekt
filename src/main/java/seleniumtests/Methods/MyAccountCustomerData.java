package seleniumtests.Methods;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import seleniumtests.Page.InvoiceInformationPage;
import seleniumtests.Page.MyAccountCustomerPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by jwiczkowski on 13.09.16.
 */
public class MyAccountCustomerData
{
    public static void clickCustomerInformation(WebDriver driver)
    {
        try
        {
            MyAccountCustomerPage myAccount = new MyAccountCustomerPage();
            myAccount.customerInformationButton(driver).click();

        }
        catch (WebDriverException ex)
        {
            fail("Der Button Kundendaten ist nicht klickbar!");
        }

    }

    public static void clickChangeData(WebDriver driver)
    {
        try
        {
            MyAccountCustomerPage myAccount = new MyAccountCustomerPage();
            myAccount.changeDataButton(driver).click();

        }
        catch (WebDriverException ex)
        {
            fail("der Button Kundendaten ändern ist nicht klickbar!");
        }

    }

    public static void verifySalutation(WebDriver driver, String salutation)
    {
        try
        {
            MyAccountCustomerPage myAccount = new MyAccountCustomerPage();
            Select select = new Select(myAccount.salutationDropdown(driver));
            assertEquals(select.getFirstSelectedOption().getText(), salutation, "Anrede nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Anrede ändern nicht sichtbar / klickbar");
        }
    }

    public static void verifyFirstName(WebDriver driver, String firstName)
    {
        try
        {
            MyAccountCustomerPage myAccount = new MyAccountCustomerPage();
            assertEquals(myAccount.inputFirstName(driver).getAttribute("value"), firstName , "Vorname nicht gleich!");
        }
        catch (WebDriverException ex)
        {
            fail("Vorname ändern nicht sichtbar / klickbar");
        }
    }

    public static void verifyLastName(WebDriver driver, String lastName)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputLastName(driver).getAttribute("value"), lastName, "Nachname nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Nachname ändern nicht sichtbar / klickbar ");
        }
    }

    public static void verifyStreet(WebDriver driver, String street)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputStreet(driver).getAttribute("value"), street, "Straße nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Straße ändern nicht klickbar / sichtbar");
        }
    }


    public static void verifyHouseNo(WebDriver driver, String houseNo)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputHouseNo(driver).getAttribute("value"), houseNo, "Hausnummer ist nicht gleich");

        }
        catch (WebDriverException ex)
        {
            fail("Hausnummer ändern nicht klickbar / sichtbar");
        }
    }

    public static void verifyZipCode(WebDriver driver, String zipCode)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputZip(driver).getAttribute("value"), zipCode, "PLZ ist nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("PLZ ändern nicht klickbar / sichtbar");
        }
    }

    public static void verifyCity(WebDriver driver, String city)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputCity(driver).getAttribute("value"), city, "Ort nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Ort ändern nicht sichtbar / klickbar");
        }
    }

    public static void verifyCountry(WebDriver driver, String country)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            Select select = new Select(myaccount.countryDropdown(driver));
            assertEquals((select.getFirstSelectedOption().getText()), country, "Land nicht gleich!");
        }
        catch (WebDriverException ex)
        {
            fail("Land ändern nicht klickbar / sichtbar");
        }
    }

    public static void verifyPhoneNum(WebDriver driver, String phoneNum)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputPhoneNum(driver).getAttribute("value"), phoneNum, "Telefonnummer nicht gleich!");
        }
        catch (WebDriverException ex)
        {
            fail("Telefonnummer ändern Feld nicht sichtbar / klickbar");
        }
    }

    public static void verifyBirthDay(WebDriver driver, String day)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputBirthDay(driver).getAttribute("value"), day,"Geburtstag nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Geburtstag ändern nicht klickbar / sichtbar");
        }
    }

    public static void verifyBirthMonth(WebDriver driver, String month)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputBirthMonth(driver).getAttribute("value"), month, "Monat nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Geburtsmonat ändern nicht sichtbar / klickbar");
        }
    }

    public static void verifyBirthYear(WebDriver driver, String year)
    {
        try
        {
            MyAccountCustomerPage myaccount = new MyAccountCustomerPage();
            assertEquals(myaccount.inputBirthYear(driver).getAttribute("value"), year, "Jahr nicht gleich!");

        }
        catch (WebDriverException ex)
        {
            fail("Geburtsjahr ändern nicht klickbar / sichtbar");
        }
    }
}

package seleniumtests.Methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import seleniumtests.Page.InvoiceInformationPage;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by jwiczkowski on 30.08.16.
 */
public class InvoiceInformation
{
    public static void typeZipCode(WebDriver driver, String zip)
    {
        try
        {
            InvoiceInformationPage invoicezip = new InvoiceInformationPage();
            invoicezip.inputZip(driver).click();
            invoicezip.inputZip(driver).sendKeys(zip);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld PLZ ist nicht klickbar!");
        }
    }

    public static void selectSalutation(WebDriver driver, String salutation)
    {
        Select select = new Select(InvoiceInformationPage.selectSalutation(driver));
        select.selectByVisibleText(salutation);
    }

    public static void selectCountry(WebDriver driver, String country)
    {
        Select select = new Select(InvoiceInformationPage.selectCountry(driver));
        select.selectByVisibleText(country);
    }

    public static void typeBDay(WebDriver driver, String day)
    {
        try
        {
            InvoiceInformationPage invoiceBDay = new InvoiceInformationPage();
            invoiceBDay.inputBirthDay(driver).click();
            invoiceBDay.inputBirthDay(driver).sendKeys(day);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Geburtstag ist nicht klickbar!");
        }
    }

    public static void typeBMonth(WebDriver driver, String month)
    {
        try
        {
            InvoiceInformationPage invoiceBMonth = new InvoiceInformationPage();
            invoiceBMonth.inputBirthMonth(driver).click();
            invoiceBMonth.inputBirthMonth(driver).sendKeys(month);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Geburtsmonat ist nicht klickbar!");
        }
    }

    public static void typeBYear(WebDriver driver, String year)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputYear(driver).click();
            invoice.inputYear(driver).sendKeys(year);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Geburtjahr ist nicht klickbar!");
        }
    }

    public static void typePassword(WebDriver driver, String password)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputPassword(driver).click();
            invoice.inputPassword(driver).sendKeys(password);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Passwort ist nicht klickbar!");
        }
    }

    public static void typePasswortRepeat(WebDriver driver, String repeatPassword)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputPasswordRepeat(driver).click();
            invoice.inputPasswordRepeat(driver).sendKeys(repeatPassword);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Passwort ist nicht klickbar!");
        }
    }

    public static void typePhoneNum(WebDriver driver, String phoneNum)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputphoneNum(driver).click();
            invoice.inputphoneNum(driver).sendKeys(phoneNum);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Telefonnummer ist nicht klickbar!");
        }
    }

    public static void typeStreet(WebDriver driver, String street)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputStreet(driver).click();
            invoice.inputStreet(driver).sendKeys(street);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Straße ist nicht klickbar!");
        }
    }

    public static void typeHouseNo(WebDriver driver, String houseNo)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputHouseNo(driver).click();
            invoice.inputHouseNo(driver).sendKeys(houseNo);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Hausnummer ist nicht klickbar!");
        }
    }

    public static void typeFirstName(WebDriver driver, String firstName)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputFirstName(driver).click();
            invoice.inputFirstName(driver).sendKeys(firstName);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Vorname ist nicht klickbar!");
        }
    }

    public static void typeLastName(WebDriver driver, String lastName)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputLastName(driver).click();
            invoice.inputLastName(driver).sendKeys(lastName);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Nachname ist nicht klickbar!");
        }
    }

    public static void typeCity(WebDriver driver, String city)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputCity(driver).click();
            invoice.inputCity(driver).sendKeys(city);
        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Ort ist nicht klickbar!");
        }
    }

    public static void typeEmail(WebDriver driver, String email)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputEmail(driver).click();
            invoice.inputEmail(driver).sendKeys(email);

        }
        catch (WebDriverException ex)
        {
            fail("Das Feld Email ist nicht klickbar!");
        }
    }

    public static void clickRegButton(WebDriver driver)
    {
        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.regButton(driver).click();
        }
        catch (WebDriverException ex)
        {
            fail("Registrierung abschließen ist nicht klickbar!");
        }
    }

    public static void typeEmailRepeat(WebDriver driver, String email)
    {

        try
        {
            InvoiceInformationPage invoice = new InvoiceInformationPage();
            invoice.inputEmailRepeat(driver).click();
            invoice.inputEmailRepeat(driver).sendKeys(email);

        }
        catch (WebDriverException ex)
        {
            fail("Email wiederholen ist nicht klickbar!");
        }
    }
}



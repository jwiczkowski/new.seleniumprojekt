package seleniumtests.Tests;

import org.testng.annotations.Test;
import seleniumtests.Methods.InvoiceInformation;
import seleniumtests.Methods.MyAccountCustomerData;
import seleniumtests.Page.InvoiceInformationPage;
import seleniumtests.Templates.TestTemplate;

import java.util.Random;

import static org.testng.Assert.assertEquals;

/**
 * Created by jwiczkowski on 18.08.16.
 */
public class NewCustomerRegistrationTest extends TestTemplate
{
    @Test (priority = 10)
    public void login() throws InterruptedException {
        Random randomNumGen = new Random();
        int randomInt = randomNumGen.nextInt(10000);

        String email = "myrandomemail" + randomInt + "@example.com";

        driver.get("http://mocli.plenty-showcase.de/callisto-light-3-2/registrierung/");
        InvoiceInformation.typeEmail(driver, email);                     // Füllt das email feld bei der Registrierung aus
        InvoiceInformation.typeEmailRepeat(driver, email);               // Füllt das email wiederholen Feld bei der Registrierung aus
        InvoiceInformation.typePassword(driver, "Test321123");           // Füllt das Passwort Feld bei der Registrierung aus
        InvoiceInformation.typePasswortRepeat(driver, "Test321123");     // Füllt das Passwort wiederholen  Feld bei der Registrierung aus
        InvoiceInformation.typeBDay(driver, "11");                       // Füllt das Geburtstags Feld bei der Registrierung aus
        InvoiceInformation.typeBMonth(driver, "7");                      // Füllt das Geburtsmonat  Feld bei der Registrierung aus
        InvoiceInformation.typeBYear(driver, "1989");                    // Füllt das Geburtsjahr  Feld bei der Registrierung aus
        InvoiceInformation.typePhoneNum(driver, "05665-1838849");        // Füllt das Telefonnummer  Feld bei der Registrierung aus
        InvoiceInformation.selectSalutation(driver, "Frau");             // Wählt die Anrede bei der Registrierung aus
        InvoiceInformation.typeStreet(driver, "Pferdeholzweg");          // Füllt das Straße Feld bei der Registrierung aus
        InvoiceInformation.typeHouseNo(driver, "5");                     // Füllt das Hausnummer  Feld bei der Registrierung aus
        InvoiceInformation.typeLastName(driver, "Caldener");             // Füllt das Nachnamen  Feld bei der Registrierung aus
        InvoiceInformation.typeFirstName(driver, "randomgirl");          // Füllt das Vornamen  Feld bei der Registrierung aus
        InvoiceInformation.typeZipCode(driver, "34123");                 // Füllt das PLZ  Feld bei der Registrierung aus
        InvoiceInformation.typeCity(driver, "Kassel");                   // Füllt das Stadt  Feld bei der Registrierung aus
        InvoiceInformation.selectCountry(driver, "Deutschland");         // Wahlt das Land bei der Registrierung
        InvoiceInformation.clickRegButton(driver);                       // Klickt auf den Registrierung abschließen button
        Thread.sleep(3000);                                              // Idiotischer schlaf Befehl

     }

    @Test (priority = 20)
    public void myAccountDataVerification()
    {
        driver.get("http://mocli.plenty-showcase.de/my-account/");
        MyAccountCustomerData.clickCustomerInformation(driver);          // klickt auf Kundendaten
        MyAccountCustomerData.clickChangeData(driver);                   // klickt auf Kundendaten ändern;
        MyAccountCustomerData.verifySalutation(driver, "Frau");          // checkt ob die Anrede richtig ausgewählt wurde
        MyAccountCustomerData.verifyFirstName(driver, "randomgirl");     // checkt ob der Vorname übnereinstimmt
        MyAccountCustomerData.verifyStreet(driver , "Pferdeholzweg");    // Straße
        MyAccountCustomerData.verifyHouseNo(driver, "5");                // Hausnummer
        MyAccountCustomerData.verifyZipCode(driver, "34123");            // PLZ
        MyAccountCustomerData.verifyCity(driver, "Kassel");              // Stadt
        MyAccountCustomerData.verifyCountry(driver, "Deutschland");      // Land :')
        MyAccountCustomerData.verifyBirthDay(driver, "11");              // BDay
        MyAccountCustomerData.verifyBirthMonth(driver, "07");            // BMonth
        MyAccountCustomerData.verifyBirthYear(driver, "1989");           // BYear
    }
}




package seleniumtests.Templates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;

/**
 * Created by jwiczkowski on 18.08.16.
 */
public class TestTemplate
{
    public static WebDriver driver;

    @BeforeTest
    public void setUp()
    {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeWindow()
    {
        driver.close();
    }

    @AfterMethod
    public void showConsoleErrors(ITestResult result)
    {
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            for (LogEntry entry : logEntries)
            {
                if(entry.getLevel().equals(Level.SEVERE))
                {
                    System.out.println("----- ERROR DEVELOPER CONSOLE -----");
                    System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
                }
            }
    }
}

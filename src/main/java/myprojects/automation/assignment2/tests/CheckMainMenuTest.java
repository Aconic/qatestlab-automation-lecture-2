package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.WebDriver;

import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;

public class CheckMainMenuTest extends BaseScript
{

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.get(getBaseAdminUrl());
        driver.close();
    }
}

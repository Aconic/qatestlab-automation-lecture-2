package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;

public class CheckMainMenuTest extends BaseScript
{

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.get(getBaseAdminUrl());

        WebElement email = driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.name("submitLogin"));

        email.sendKeys("webinar.test@gmail.com");
        passwd.sendKeys("Xcg7299bnSmMuRLp9ITw");
        submit.click();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement orderTab = driver.findElement(By.xpath("//li[@data-submenu='3']"));
        orderTab.click();
        String orderTitle = driver.findElement(By.cssSelector("h2")).getText();
        System.out.println(orderTitle);
        driver.navigate().refresh();
        System.out.println("Page title match result: " + orderTitle.equals(driver.findElement(By.cssSelector("h2")).getText()));

        WebElement ctlgTab = driver.findElement(By.xpath("//li[@data-submenu='9']"));
        ctlgTab.click();
        String ctlgTitle = driver.findElement(By.cssSelector("h2")).getText();
        System.out.println(ctlgTitle);
        driver.navigate().refresh();
        System.out.println("Page title match result: " +  ctlgTitle.equals(driver.findElement(By.cssSelector("h2")).getText()));

        WebElement supportTab = driver.findElement(By.xpath("//li[@data-submenu='27']"));
        supportTab.click();
        String supportTitle = driver.findElement(By.cssSelector("h2")).getText();
        System.out.println(supportTitle);
        driver.navigate().refresh();
        System.out.println("Page title match result: " +  supportTitle.equals(driver.findElement(By.cssSelector("h2")).getText()));

        WebElement statsTab = driver.findElement(By.xpath("//li[@data-submenu='31']"));
        statsTab.click();
        String statsTitle = driver.findElement(By.cssSelector("h2")).getText();
        System.out.println(statsTitle);
        driver.navigate().refresh();
        System.out.println("Page title match result: " +  statsTitle.equals(driver.findElement(By.cssSelector("h2")).getText()));

        driver.close();
    }

}

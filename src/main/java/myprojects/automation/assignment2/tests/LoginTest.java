package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();
        driver.get(getBaseAdminUrl());

        WebElement email= driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.name("submitLogin"));

        email.sendKeys("webinar.test@gmail.com");
        passwd.sendKeys("Xcg7299bnSmMuRLp9ITw");
        submit.click();

        (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("img-thumbnail")));

        WebElement user = driver.findElement(By.className("img-thumbnail"));
        user.click();

        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
        driver.quit();
    }
}

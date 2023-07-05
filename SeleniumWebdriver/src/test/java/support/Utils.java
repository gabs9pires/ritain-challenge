package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.util.Random;

public class Utils extends RunCucumber {

    public void logarSite(){
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(true, driver.findElement(By.id("login_button_container")).isDisplayed());
    }
    public void fazerLoginUserDefault(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}

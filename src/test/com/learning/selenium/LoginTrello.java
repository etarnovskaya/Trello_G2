package test.com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTrello extends TestBase{

    @Test
    public void logInAtlassianAcc() throws InterruptedException {
        initLogin();
        fillAtlassianLoginForm("rochman.elena@gmail.com", "12345.com");
        submitLogin();
    }


}

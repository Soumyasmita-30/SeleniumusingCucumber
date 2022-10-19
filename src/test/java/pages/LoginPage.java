package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login = By.id("login-button");

    //creating a constructor to use this WebDriver instance and passing a driver instance from POM page
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void enterUsername(String Username){
        driver.findElement(txt_username).sendKeys(Username);

    }
    public void enterPassword(String Password){
        driver.findElement(txt_password).sendKeys(Password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
}

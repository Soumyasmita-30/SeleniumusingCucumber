package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOrange {
    WebDriver driver;
    By txt_username = By.name("username");
    By txt_password = By.name("password");
    By btn_login = By.xpath("//button[@type='submit']");
   // By btn_login = By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button");

    //creating a constructor to use this WebDriver instance and passing a driver instance from POM page
    public LoginPageOrange(WebDriver driver){
        this.driver = driver;
    }


    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);

    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
}

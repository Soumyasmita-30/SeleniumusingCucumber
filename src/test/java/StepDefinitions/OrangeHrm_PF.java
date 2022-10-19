//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pageFactory.loginPageOrangeHrm_PF;
//
//public class OrangeHrm_PF {
//    WebDriver driver = null;
//    loginPageOrangeHrm_PF login;
//
//    @Given("browser is launched")
//   public void browser_is_launched() {
//        System.out.println("Inside test :browser is launched...!");
//        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//    }
//
//    @Given("user is on Orange HRM login page")
//    public void user_is_on_orange_hrm_login_page() throws InterruptedException {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(2000);
//    }
//
//    @When("^user enters (.*)$")
//    public void user_enters_Username(String Username) throws InterruptedException {
//        login = new loginPageOrangeHrm_PF(driver);
//        login.enterUsername(Username);
//       // driver.findElement(By.name("username")).sendKeys(Username);
//Thread.sleep(2000);
//    }
//
//    @And("^enters (.*)$")
//   public void enters_Password(String Password) throws InterruptedException {
//        login.enterPassword(Password);
//        //driver.findElement(By.name("password")).sendKeys(Password);
//        Thread.sleep(3000);
//    }
//
//    @Then("user is navigated to homepage")
//    public void user_is_navigated_to_homepage() throws InterruptedException {
//        login.clickLogin();
//       // driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//        Thread.sleep(4000);
//        driver.quit();
//
//    }
//
//
//   }
//

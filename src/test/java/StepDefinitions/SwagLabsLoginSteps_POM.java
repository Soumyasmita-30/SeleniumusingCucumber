//package StepDefinitions;//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.LoginPage;
//
//import java.time.Duration;
//
//public class SwagLabsLoginSteps_POM {
//    WebDriver driver = null;
//    LoginPage login;//loginPage object to access that method
//
//
//    @Given("browser is launched")
//    public void browser_is_launched() {
//        System.out.println("inside Swaglabs_POM");
//        System.out.println("Inside test :browser is launched...!");
//        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//    }
//
//    @And("user is on Swag Labs login page")
//    public void user_is_on_swag_labs_login_page() throws InterruptedException {
//        System.out.println("Inside test :user is on Swag Labs login page");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//
//    }
//
//    @When("^user enters (.*)$")
//    public void user_enters_username(String username) throws InterruptedException {
//        System.out.println("inside test:user enters username");
//       login = new LoginPage(driver);
//       login.enterUsername(username);
//        //driver.findElement(By.id("user-name")).sendKeys(username);
//        Thread.sleep(1000);
//
//    }
//
//    @And("^enters (.*)$")
//    public void enters_password(String password) throws InterruptedException {
//        System.out.println("inside test:user enters  password");
//      login.enterPassword(password);
//       // driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//
//
//    }
//
//    @Then("user is navigated to the homepage")
//    public void userIsNavigatedToTheHomepage() throws InterruptedException {
//        System.out.println("user is navigated to homepage");
//       login.clickLogin();
//        // driver.findElement(By.id("login-button")).click();
//       // Thread.sleep(2000);
//
//        driver.quit();
//
//
//    }
//}
//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class SwagLabLoginSteps {
//    WebDriver driver = null;
//
//@Given("browser is launched")
//public void browser_is_launched() {
//
//    System.out.println("Inside test :browser is launched...!");
//    System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().deleteAllCookies();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//}
//    @And("user is on Swag Labs login page")
//    public void user_is_on_swag_labs_login_page() throws InterruptedException {
//        System.out.println("Inside test :user is on Swag Labs login page");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//
//
//    }
//    @When("user enters username")
//    public void user_enters_username() {
//        System.out.println("inside test:user enters username");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//
//
//    }
//    @And("user enters  password")
//    public void user_enters_password() {
//        System.out.println("inside test:user enters  password");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//    }
//    @Then("user is navigated to the homepage")
//    public void user_is_navigated_to_the_homepage() throws InterruptedException {
//        System.out.println("user is navigated to the homepage");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//
//
//    }
//}
//
//
//

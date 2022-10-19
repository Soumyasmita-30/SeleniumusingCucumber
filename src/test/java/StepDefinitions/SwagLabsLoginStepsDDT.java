//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class SwagLabsLoginStepsDDT {
//    WebDriver driver = null;
//
//
//    @Given("browser is launched")
//    public void browser_is_launched() {
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
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        Thread.sleep(1000);
//
//    }
//
//    @And("^enters (.*)$")
//    public void enters_password(String password) throws InterruptedException {
//        System.out.println("inside test:user enters  password");
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//
//
//    }
//
//    @Then("user is navigated to the homepage")
//    public void userIsNavigatedToTheHomepage() throws InterruptedException {
//        System.out.println("user is navigated to homepage");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//        try {
//            Boolean loginText = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
//            if (loginText) {
//                System.out.println("successfully logged in");
//
//            } else {
//                System.out.println("login unsuccessful");
//            }
//            Thread.sleep(2000);
//        }
//        catch(NoSuchElementException e){
//            System.out.println("login unsuccessful");}
//               finally {
//            driver.quit();
//        }
//
//
//            }
//    }

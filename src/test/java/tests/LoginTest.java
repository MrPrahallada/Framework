package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import pages.AccountSignUpPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

     RemoteWebDriver driver;
     LoginPage loginPage;
     HomePage homePage;
    // AccountSignUpPage signUpPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prahallada_v\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
      //  signUpPage = new AccountSignUpPage(driver);
    }

    @Test(priority = 1)
    public void loginTest() {
        loginPage.login("email", "pass");

    }

//    @Test(priority = 2)
//    public void signupTest() {
//
//        driver.get("https://www.facebook.com/signup");
//
//        signUpPage.getFirstNameField().sendKeys("Prahallada");
//        signUpPage.getLastNameField().sendKeys("V");
//        signUpPage.getMobileEmailAddressField().sendKeys("prahallada@gmail.com");
//
//        signUpPage.selectDayOfBirth("21");
//        signUpPage.selectMonthOfBirth("Jun");
//        signUpPage.selectYearOfBirth("2000");
//
//        signUpPage.selectGender("male");
//
//        signUpPage.clickSignUpButton();
//
//        Assert.assertTrue(homePage.isHomePageDisplayed(), "Sign up successful");
//    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

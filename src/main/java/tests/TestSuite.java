package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import pages.AccountSignUpPage;
import pages.HomePage;
import pages.LoginPage;

public class TestSuite {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
   // private AccountSignUpPage signUpPage;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prahallada_v\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize Page Objects
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
     //   signUpPage = new AccountSignUpPage(driver);
    }

    @Test(priority = 1)
    public void loginTest() {
        driver.get("https://www.facebook.com/");
        loginPage.login("email", "pass");

         Assert.assertTrue(homePage.isHomePageDisplayed(), "Login successful");
    }

//    @Test(priority = 2)
//    public void signUpTest() {
//        driver.get("https://www.facebook.com/signup");
//
//        signUpPage.getFirstNameField().sendKeys("Prahalladda");
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

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


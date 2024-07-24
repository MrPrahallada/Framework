package pages;

import org.openqa.selenium.WebDriver;

//This class is like a parent class of all pages
public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
}

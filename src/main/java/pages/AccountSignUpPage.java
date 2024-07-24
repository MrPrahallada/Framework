//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//
//public class AccountSignUpPage extends BasePage {
//
//    @FindBy(xpath = "//input[@type='text'][2]")
//    public WebElement firstNameField;
//
//    @FindBy(name = "lastname")
//    public WebElement lastNameField;
//
//    @FindBy(xpath = "//input[@name='reg_email__']")
//    public WebElement mobileEmailAddressField;
//
//    @FindBy(xpath = "//select[@title='Day']")
//    public WebElement dayDropdownElement;
//
//    @FindBy(xpath = "//select[@title='Month']")
//    public WebElement monthDropdownElement;
//
//    @FindBy(xpath = "//select[@title='Year']")
//    public WebElement yearDropdownElement;
//
//    @FindBy(id = "u_y_4_9G")
//    public WebElement femaleRadioButton;
//
//    @FindBy(id = "u_y_5_8h")
//    public WebElement maleRadioButton;
//
//    @FindBy(className = "_58mt")
//    public WebElement customRadioButton;
//
//    @FindBy(className = "websubmit")
//    public WebElement signupButton;
//
//   Select dayDropdown;
//    Select monthDropdown;
//    Select yearDropdown;
//
//    public AccountSignUpPage(WebDriver driver) {
//        super(driver);
//        PageFactory.initElements(driver, this);
//        Select dayDropdown = new Select(dayDropdownElement);
//       Select monthDropdown = new Select(monthDropdownElement);
//       Select yearDropdown = new Select(yearDropdownElement);
//    }
//
//    public void selectDayOfBirth(String day) {
//        dayDropdown.selectByVisibleText(day);
//    }
//
//    public void selectMonthOfBirth(String month) {
//        monthDropdown.selectByVisibleText(month);
//    }
//
//    public void selectYearOfBirth(String year) {
//        yearDropdown.selectByVisibleText(year);
//    }
//
//    public void selectGender(String gender) {
//        if (gender.equalsIgnoreCase("female")) {
//            femaleRadioButton.click();
//        } else if (gender.equalsIgnoreCase("male")) {
//            maleRadioButton.click();
//        } else if (gender.equalsIgnoreCase("custom")) {
//            customRadioButton.click();
//        } else {
//            throw new IllegalArgumentException("Invalid gender: " + gender);
//        }
//    }
//
//    public void clickSignUpButton() {
//        signupButton.click();
//    }
//
//    // Getters for WebElement fields if needed
//    public WebElement getFirstNameField() {
//        return firstNameField;
//    }
//
//    public WebElement getLastNameField() {
//        return lastNameField;
//    }
//
//    public WebElement getMobileEmailAddressField() {
//        return mobileEmailAddressField;
//
//    }
//}

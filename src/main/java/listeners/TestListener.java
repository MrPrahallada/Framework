//package listeners;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import java.util.Objects;
//
////ChatGPT
//public class TestListener extends AbstractWebDriverEventListener implements ITestListener {
//
//    private WebDriver driver; // WebDriver instance
//
//    @Override
//    public void onStart(ITestContext context) {
//        System.out.println("Test Suite started: " + context.getName());
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        System.out.println("Test Suite finished: " + context.getName());
//    }
//
//    @Override
//    public void onTestStart(ITestResult result) {
//        System.out.println("Test Started: " + result.getName());
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        System.out.println("Test Passed: " + result.getName());
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        System.out.println("Test Failed: " + result.getName());
//        captureScreenshot(result);
//        logFailureDetails(result);
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        System.out.println("Test Skipped: " + result.getName());
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        // Not implemented in this example
//    }
//
//    // WebDriver event listeners
//    @Override
//    public void beforeNavigateTo(String url, WebDriver driver) {
//        System.out.println("Before navigating to: " + url);
//    }
//
//    @Override
//    public void afterNavigateTo(String url, WebDriver driver) {
//        System.out.println("Navigated to: " + url);
//    }
//
//    // Helper methods
//    private void captureScreenshot(ITestResult result) {
//        // Check if WebDriver instance is available
//        if (driver instanceof TakesScreenshot) {
//            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
//            byte[] screenshot = screenshotDriver.getScreenshotAs(OutputType.BYTES);
//            result.setAttribute("screenshot", screenshot);
//        }
//    }
//
//    private void logFailureDetails(ITestResult result) {
//        Throwable throwable = result.getThrowable();
//        if (Objects.nonNull(throwable)) {
//            System.out.println("Test Failure Details:");
//            throwable.printStackTrace();
//        }
//    }
//
////    // TestNG interface methods (unused in this class, but need to be implemented)
////    @Override
////    public void onTestStart(ITestResult result, WebDriver driver) {
////        // Implement if needed
////    }
////
////    @Override
////    public void onTestSuccess(ITestResult result, WebDriver driver) {
////        // Implement if neededslkgj
////    }
////
////    @Override
////    public void onTestFailure(ITestResult result, WebDriver driver) {
////        // Implement if needed
////    }
////
////    @Override
////    public void onTestSkipped(ITestResult result, WebDriver driver) {
////        // Implement if needed
////    }
////
////    @Override
////    public void onTestFailedButWithinSuccessPercentage(ITestResult result, WebDriver driver) {
////        // Implement if needed
////    }
////
////    @Override
////    public void onStart(ITestContext context, WebDriver driver) {
////        // Implement if needed
////    }
////
////    @Override
////    public void onFinish(ITestContext context, WebDriver driver) {
////        // Implement if needed
////    }
//
//    // Getter and Setter for WebDriver instance
//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    public void setDriver(WebDriver driver) {
//        this.driver = driver;
//    }
//}

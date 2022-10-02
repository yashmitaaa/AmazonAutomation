import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static void signInPage(WebDriver driver)
    {
        driver.findElement(By.id("nav-link-accountList")).click();
        SignIn.signInUserName(driver);
        SignIn.signInPassword(driver);
    }


    public static void searchFunc(WebDriver driver) throws InterruptedException {
        Search.searchItem(driver);
        Search.selectResults(driver);
    }
}

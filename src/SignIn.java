import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn
{
    public static void signInUserName(WebDriver driver)
    {
        driver.findElement(By.id("ap_email")).sendKeys(/*email/ph No*/);
        driver.findElement(By.className("a-button-input")).click();
    }
    public static void signInPassword(WebDriver driver)
    {
        driver.findElement(By.id("ap_password")).sendKeys(/*password*/);
        driver.findElement(By.id("signInSubmit")).click();
    }
}

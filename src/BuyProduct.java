import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyProduct
{

    public static void buyNow(WebDriver driver) {
        driver.findElement(By.id("buy-now-button")).click();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search
{
    public static void searchItem(WebDriver driver) throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watches");
        driver.findElement(By.id("twotabsearchtextbox")).submit();
    }

    public static void selectResults(WebDriver driver) throws InterruptedException {
        List<WebElement> items = driver.findElements(By.cssSelector("img.s-image"));
//        for(WebElement e: items) {
//            System.out.println(e.getText());
//        }
        Thread.sleep(1500);
        items.get(3).click();
        HandleMultipleWindows.handleWindows(driver);
        BuyProduct.buyNow(driver);

    }
}

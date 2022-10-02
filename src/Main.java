import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/yashmita/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

            driver.navigate().to("https://www.amazon.in/");
            driver.manage().window().maximize();

            HomePage.signInPage(driver);
            HomePage.searchFunc(driver);

    }
}
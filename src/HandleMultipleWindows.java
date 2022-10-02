import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindows {
    public static void handleWindows(WebDriver driver)
    {
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();

        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
    }
}

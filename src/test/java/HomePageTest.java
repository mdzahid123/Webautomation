import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class HomePageTest {
    public static void main(String[] args) {

        /**
         *   https://chromedriver.chromium.org/getting-started
         **/

        System.setProperty("webdriver.chrome.driver", "/Users/mdahsanzahid/Documents/IdeaProjects/Webautomation/Driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.id("search_query_top")).sendKeys("t - Shirt");
        driver.findElement(By.name("submit_search")).click();
        String actualValue = driver.findElement(By.className("product-count")).getText();
        System.out.println(actualValue);
        String expectedValue = "Showing 1 - 1 of 1 item";
      // Assert.assertElements (actualValue, expectedValue);

       driver.close();

    }
}

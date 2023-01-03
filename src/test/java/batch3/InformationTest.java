package batch3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InformationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Display : "+ driver.findElement(By.id("userName")).isDisplayed());
        System.out.println("IsEnabled : "+ driver.findElement(By.id("userName")).isEnabled());
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/checkbox");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);


    }

}
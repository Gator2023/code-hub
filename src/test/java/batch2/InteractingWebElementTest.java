package batch2;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractingWebElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.className("Sloutions")).getText();
        driver.findElement(By.name("username")).sendKeys("sqalearning");
        driver.findElements(By.name("username")).clear();
        Thread.sleep(2000);

        driver.quit();
    }

    }


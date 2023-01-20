package batch1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTests {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();

                driver.findElement(By.name("username")).sendKeys("saima123@gmail.com");
                Thread.sleep(3000);
                driver.findElement(By.name("password")).sendKeys("abc@123");
                Thread.sleep(3000);
                driver.findElement(By.className("button")).click();
                Thread.sleep(3000);
                driver.findElement(By.linkText("Services")).click();
                Thread.sleep(3000);
                driver.findElement(By.partialLinkText("min Pa")).click();
                Thread.sleep(3000);
                driver.findElement(By.tagName("div")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Saima");
                Thread.sleep(3000);


    }

}


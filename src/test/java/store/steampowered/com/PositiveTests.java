package store.steampowered.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests extends TestInit {
    @Test
    public void loginTests(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://store.steampowered.com/";
        driver.get(url);

        String expectedURL = "https://store.steampowered.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Actual page URL is not the same as expected.");

        sleep(5);
        driver.manage().window().maximize();
        sleep(5);
        driver.findElement(By.xpath("//a[text()='увійти']")).click();
        sleep(5);

        WebElement logIn = driver.findElement(By.xpath("//button[text()='Увійти']"));
        Assert.assertTrue(logIn.isDisplayed(), "LogIn button is not visible.");

        WebElement username = driver.findElement(By.xpath("(//input[@class='newlogindialog_TextInput_2eKVn'])[1]"));
        username.sendKeys("anyashyta");
        sleep(5);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("eduard27072002");
        sleep(5);
        logIn.click();
        sleep(5);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("6");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("C");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("4");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("C");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("4");
/*        driver.quit();*/

    }
}
//6C4D4

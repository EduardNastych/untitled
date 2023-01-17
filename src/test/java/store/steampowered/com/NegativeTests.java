package store.steampowered.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeTests extends TestInit{
   /* @Test(priority = 1, groups = { "negativeTests", "smokeTests" })
    public void incorrectLogin(){
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
        username.sendKeys("eduardnastych");
        sleep(5);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("eduard27072002");
        sleep(5);
        logIn.click();
        sleep(5);

        WebElement popUpNotification = driver.findElement(By.xpath("//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']"));
        Assert.assertTrue(popUpNotification.isDisplayed(), "Pop-up notification isn`t visible");
    }
    @Test(priority = 2, groups = { "negativeTests" })
    public void incorrectPassword(){
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
        password.sendKeys("petro1234");
        sleep(5);
        logIn.click();
        sleep(5);

        WebElement popUpNotification = driver.findElement(By.xpath("//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']"));
        String expectedpopUpNotification = "Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.";
        String actualpopUpNotification = popUpNotification.getText();
        Assert.assertEquals(actualpopUpNotification, expectedpopUpNotification, "Expected massage isn`t displayed" );
    }
*/


    @Parameters({ "username", "password", "expectedpopUpNotification" })
    @Test
    public void incorrectLoginAndPassword(String username, String password, String expectedpopUpNotification){
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

        WebElement usernameElement = driver.findElement(By.xpath("(//input[@class='newlogindialog_TextInput_2eKVn'])[1]"));
        usernameElement.sendKeys(username);
        sleep(5);
        WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
        passwordElement.sendKeys(password);
        sleep(5);
        logIn.click();
        sleep(5);

        WebElement popUpNotification = driver.findElement(By.xpath("//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']"));
        Assert.assertTrue(popUpNotification.isDisplayed(), "Pop-up notification isn`t visible");

        String actualpopUpNotification = popUpNotification.getText();
        Assert.assertEquals(actualpopUpNotification, expectedpopUpNotification, "Expected message isn`t displayed" );
    }
}

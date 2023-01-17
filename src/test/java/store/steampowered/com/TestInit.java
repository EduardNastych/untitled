package store.steampowered.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInit {
    protected WebDriver driver;
    public void sleep(int second){
        try {
            Thread.sleep(second * 1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

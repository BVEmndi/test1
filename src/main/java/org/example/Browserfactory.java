package org.example;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browserfactory {
    public static WebDriver driver;
public void openBrowser(String BROWSER,String url)
{
    if(BROWSER.equals("firefox"))
    {
        FirefoxDriverManager.firefoxdriver();
                driver=new FirefoxDriver();
    }
    else if(BROWSER.equals("chrome"))
    {
        ChromeDriverManager.chromedriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanim\\IdeaProjects\\Slimlinksproject\\src\\test\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
    }
driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

}

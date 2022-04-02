package Lesson_13_andersenlab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;


public class TestUI {
    ChromeDriver driver;


    @BeforeEach
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");
    }

    @Test //Проверка на изменение цвета при нажатии на кнопку QA в секции Experts
    public void background_color() {
        //driver.findElement(By.xpath("//a[@class='MainNav-module--link--HnRAu MainNav-module--indexPage--RWmzP']")).click();
        WebElement a = driver.findElement(By.xpath("//section[@id='experts']/div/div/div[5]"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", a);
        driver.findElement(By.xpath("//section[@id='experts']/div/div/div[5]")).click();
        String color = driver.findElement(By.xpath("//section[@id='experts']/div/div/div[5]")).getCssValue("background-color");
        System.out.println(color);
        Assertions.assertEquals("rgba(255, 219, 0, 1)", color);
        driver.close();
    }

    @Test
    public void skype_icon() {
        WebElement b = driver.findElement(By.xpath("//a[normalize-space()='skype']"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", b);
        driver.findElement(By.xpath("//a[normalize-space()='skype']")).click();
        List<String> windowHandles = new ArrayList(driver.getWindowHandles());
        String secondTab = windowHandles.get(1);
        driver.switchTo().window(secondTab);
        String c = driver.getCurrentUrl();
        Assertions.assertEquals("https://join.skype.com/aM8R4P4dNJdy", c);
        driver.close();
    }
}

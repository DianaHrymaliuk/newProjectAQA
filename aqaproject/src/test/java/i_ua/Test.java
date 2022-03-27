package i_ua;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    ChromeDriver driver;

    @org.junit.jupiter.api.Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.i.ua");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test.user");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234567890zz");
        driver.findElement(By.xpath("//input[@@tabindex='5']")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Створити листа')])[2]")).click(); // после входа в аккаунт, есть только украинский, поэтому xpath не должен меняться
        driver.findElement(By.xpath("//textarea[@id='to']")).sendKeys("diana.hrymaliuk@gmail.com");
        driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("test mail");
        driver.findElement(By.xpath("//textarea[@id='text']")).sendKeys("Hello!");
        driver.findElement(By.xpath("//input[@tabindex='12']")).click();
        String text = driver.findElement(By.xpath("//div[contains(text(),'Лист успішно відправлено адресатам')]")).getText();
        Assertions.assertEquals("Лист успішно відправлено адресатам", text);
        System.out.println(text);
        driver.quit();
    }
}


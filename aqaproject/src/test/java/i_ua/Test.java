package i_ua;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static i_ua.Constants.BASE_URL;

public class Test {
    ChromeDriver driver;

    @org.junit.jupiter.api.Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get(BASE_URL);
        new TestPage(driver)
                .fillLoginField()
                .fillPassField()
                .clickLogIn();
                //.clickNewMassage()
                //.mail()
                //.clickSendMassage();
        //String text = driver.findElement(By.xpath("//div[contains(text(),'Лист успішно відправлено адресатам')]")).getText();
        //Assertions.assertEquals("Лист успішно відправлено адресатам", text);
        String text = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        Assertions.assertEquals(text, "test.user@i.ua");
        System.out.println(text);
        driver.quit();
    }
}


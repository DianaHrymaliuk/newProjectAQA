package i_ua;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class TestPage {

    private ChromeDriver driver;
    private final String loginField = "//input[@name='login']";
    private final String passField = "//input[@name='pass']";
    private final String logInButtonXpath = "//input[@tabindex='5']";
    private final String newMailButtonXpath = "(//a[contains(text(),'Створити листа')])[2]";
    private final String sendMailButtonXpath = "//input[@tabindex='12']";
    private final String mailToFieldXpath = "//textarea[@id='to']";
    private final String mailSubjectXpath = "//input[@name='subject']";
    private final String mailTextXpath = "//textarea[@id='text']";

    public TestPage(ChromeDriver driver) {
        this.driver = driver;
    }
    Properties prop = new Properties();

    public TestPage fillLoginField() {
        driver.findElement(By.xpath(loginField)).sendKeys("test.user");
        //driver.findElement(By.xpath(loginField)).sendKeys(prop.getProperty("login"));
        //driver.findElement(By.xpath(loginField)).sendKeys(User.getUser().login);
        return this;
    }

    public TestPage fillPassField() {
        driver.findElement(By.xpath(passField)).sendKeys("1234567890zz");
        return this;
    }

    public TestPage mail() {
        driver.findElement(By.xpath(mailToFieldXpath)).sendKeys("diana.hrymaliuk@gmail.com");
        driver.findElement(By.xpath(mailSubjectXpath)).sendKeys("test mail");
        driver.findElement(By.xpath(mailTextXpath)).sendKeys("Hello!");
        return this;
    }

    public TestPage clickLogIn() {
        driver.findElement(By.xpath(logInButtonXpath)).click();
        return this;
    }

    public TestPage clickNewMassage() {
        driver.findElement(By.xpath(newMailButtonXpath)).click();
        return this;
    }

    public TestPage clickSendMassage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10, 1));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(sendMailButtonXpath)))).click();
        return this;
    }
}

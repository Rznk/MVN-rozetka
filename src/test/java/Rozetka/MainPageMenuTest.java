package Rozetka;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Rozetka.MainPageMenu;
import Rozetka.Config;
import java.util.concurrent.TimeUnit;
import Rozetka.TvElectronicMenu;
import static org.testng.Assert.*;

/**
 * Created by Andrew on 3/29/2017.
 */
public class MainPageMenuTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        Config.setUpBrowser();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.navigate().to(Config.MAIN_PAGE_URL);
    }

    @Test
    public void verifyNavigationToTvElectronic(){
        MainPageMenu page = new MainPageMenu(driver);
        page.openPhones();
        String currentTitle = driver.findElement(By.xpath(".//*[@class='pab-h1']")).getText();
        String expected = "Телефоны, ТВ и электроника";

        Assert.assertEquals(expected,currentTitle);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}
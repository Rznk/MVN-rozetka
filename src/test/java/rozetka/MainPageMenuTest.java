package rozetka;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrew on 3/29/2017.
 */
public class MainPageMenuTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        Config.setUpBrowser();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(Config.MAIN_PAGE_URL);
    }

    @Test
    public void verifyNavigationToTvElectronic(){
        MainPageMenu page = new MainPageMenu(driver);
        TvElectronicMenu pageTv = new TvElectronicMenu(driver);
        page.openTvPhones();
        String currentTitle = driver.findElement(By.xpath("//h1[@class='pab-h1']")).getText();
        String expected = "Телефоны, ТВ и электроника";
        Assert.assertEquals(expected,currentTitle);
    }

    @Test
    public void verifyNavigationToPhones(){
        TvElectronicMenu pageTv = new TvElectronicMenu(driver);
        MainPageMenu page = new MainPageMenu(driver);
        page.openTvPhones();
        pageTv.openPhones();
        String currentTitle = driver.findElement(By.xpath("//h1[@class='pab-h1']")).getText();
        String expected = "Телефоны";
        Assert.assertEquals(expected, currentTitle);
    }

    @Test
    public void verifyNavigationToSmartphones(){
        MainPageMenu page = new MainPageMenu(driver);
        TvElectronicMenu pageTv = new TvElectronicMenu(driver);
        Phones pagePhones = new Phones(driver);
        page.openTvPhones();
        pageTv.openPhones();
        pagePhones.openSmartPhones();
        String currentTitle = driver.findElement(By.xpath("//h1[@class='pab-h1']")).getText();
        String expected = "Все смартфоны";
        Assert.assertEquals(expected, currentTitle);
    }
    @Test
    public void searchTopPhones3pages(){
        MainPageMenu page = new MainPageMenu(driver);
        TvElectronicMenu pageTv = new TvElectronicMenu(driver);
        Phones pagePhones = new Phones(driver);
        Smartphones pageSmartphones = new Smartphones(driver);
        page.openTvPhones();
        pageTv.openPhones();
        pagePhones.openSmartPhones();
        pageSmartphones.searchForTopPhones();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}
package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TvElectronicMenu {
    private final WebDriver driver;
    private By phonesMenuElement = By.xpath(".//*[@id='menu_categories_left']/li[1]/h4/a");
    private By tvMenuElement = By.xpath(".//*[@id='menu_categories_left']/li[2]/h4/a");
    private By autoElectronicMenuElement = By.xpath(".//*[@id='menu_categories_left']/li[3]/h4/a");

    public TvElectronicMenu(WebDriver driver){
        this.driver = driver;
    }
    public void openPhones(){
        driver.findElement(phonesMenuElement).click();
    }
    public void openTv(){
        driver.findElement(tvMenuElement).click();
    }
    public void openAutoElectronic(){
        driver.findElement(autoElectronicMenuElement).click();
    }
}

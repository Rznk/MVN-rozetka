package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Phones {
    private final WebDriver driver;

    private By smartphonesMenuElement = By.xpath(".//*[@id='menu_categories_left']/li[1]/ul/li[1]/a");
    public By phonesTitle = By.xpath(".//*[@class='pab-h1']");



    public Phones(WebDriver driver){
        this.driver = driver;
    }
    public void openSmartPhones(){
        driver.findElement(smartphonesMenuElement).click();
    }

}

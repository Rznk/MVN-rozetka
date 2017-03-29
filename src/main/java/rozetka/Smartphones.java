package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Smartphones {

	private final WebDriver driver;

	private ArrayList<String> phones = new ArrayList<String>();

	public Smartphones(WebDriver driver){
		this.driver = driver;
	}
	private By allGoods = By.xpath(".//*[@name='goods_item_with_promotion']");
	private By moreGoods = By.xpath(".//*[@name='more_goods']/a");
	private By secondPage = By.xpath(".//*[@id='page2']/a");
	private By thirdPage = By.xpath(".//*[@id='page3']/a");

	private void openSecondPage(){
        driver.findElement(secondPage).click();
    }

    private void openThirdPage(){
        driver.findElement(thirdPage).click();
    }

    public void searchForTopPhones(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		List<WebElement> element = wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='g-i-tile g-i-tile-catalog']"), 32));
		loopThroughFoundedElements();
		openSecondPage();
		List<WebElement> element2 = wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='g-i-tile g-i-tile-catalog']"), 32));
		loopThroughFoundedElements();
        openThirdPage();
		List<WebElement> element3 = wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='g-i-tile g-i-tile-catalog']"), 32));
        loopThroughFoundedElements();
		for (int a = 0; a < phones.size();a = a + 2){
			System.out.println(phones.get(a) + " - " + phones.get(a+1));
		}
	}

	private void loopThroughFoundedElements(){
		for (WebElement a : driver.findElements(By.xpath("//div[div[div[i[@class='g-tag g-tag-icon-middle-popularity sprite']]]]"))){
			phones.add(a.findElement(By.xpath("div[@class='g-i-tile-i-title clearfix']/a")).getText());
			phones.add(a.findElement(By.xpath("//div[@class='g-price-uah']")).getText());
		}
	}

}
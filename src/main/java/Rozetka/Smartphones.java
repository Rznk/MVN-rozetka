package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class Smartphones {
	private final WebDriver driver;
	private ArrayList phones = new ArrayList();


	public Smartphones(Webdriver driver){
		this.driver = driver;
	}
	private By allGoods = By.xpath(".//*[@name='goods_item_with_promotion']");
	private By moreGoods = By.xpath(".//*[@name='more_goods']/a");
	private By secondPage = By.xpath(".//*[@id='page2']/a");
	private By thirdPage = By.xpath(".//*[@id='page3']/a");
//	private ArrayList phones = By.xpath("//div[div[div[i[@class='g-tag g-tag-icon-middle-popularity sprite']]]]");

	public void search(){
		phones.add(By.xpath("//div[div[div[i[@class='g-tag g-tag-icon-middle-popularity sprite']]]]"));
		System.out.println(phones);
	}

}
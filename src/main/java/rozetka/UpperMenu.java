package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpperMenu {
	private final WebDriver driver;
	private By searchInput = By.cssSelector(".rz-header-searchForTopPhones-input-text.passive");
	private By submitSearch = By.xpath(".//form/span/span/button");
	private By loginWindow = By.xpath(".//*[@name='signin']");
	private By comparison = By.xpath(".//*[@id='comparison']/a");
	private By wishlist = By.xpath(".//*[@id='wishlist']/a");
	private By cart = By.cssSelector(".sprite-side.novisited.hub-i-link.hub-i-cart-link");
	private By loginField = By.xpath(".//*[@name='login']");
	private By passwordField = By.xpath("(.//*[@name='password'])[1]");
	private By loginSubmit = By.xpath(".//*[@name='auth_submit']");
	private String password_value = "Qwerty123456";
	private String loginValue = "andrew.reznik@mail.ru";
	private String searchValue = "Samsung";
	private By cityChoose = By.xpath(".//*[@id='city-chooser']/a");
	private By KievChoose = By.xpath(".//*[@locality_id=1]");
	
	public UpperMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void login(){
		driver.findElement(loginWindow).click();
		driver.findElement(loginField).sendKeys(loginValue);
		driver.findElement(passwordField).sendKeys(password_value);
		driver.findElement(loginSubmit).click();
	}
	
	public void setPasswordalue(String val){
		password_value = val;
	}
	public void setLoginValue(String val){
		loginValue = val;
	}
	public void setSearchValue(String val){
		searchValue = val;
	}
	public void search(){
		driver.findElement(searchInput).click();
		driver.findElement(searchInput).sendKeys(searchValue);
		driver.findElement(submitSearch).click();
	}
	public void openComparison(){
		driver.findElement(comparison).click();
	}
	public void openWishlist(){
		driver.findElement(wishlist).click();
	}
	public void openCart(){
		driver.findElement(cart).click();
	}
	public void chooseCity(){
		driver.findElement(cityChoose).click();
		driver.findElement(KievChoose).click();
	}
	
	
}

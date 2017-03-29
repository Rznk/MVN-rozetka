package Rozetka;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageMenu {
	private final WebDriver driver;
	private By notebook = By.xpath(".//*[@id='2416']/a");
	private By phones = By.xpath(".//*[@id='3361']/a");
	private By appliances = By.xpath(".//*[@id='4306']/a");
	private By householdGoods = By.xpath(".//*[@id='5300']/a");
	private By instruments = By.xpath(".//*[@id='6700']/a");
	private By sanitary = By.xpath(".//*[@id='7806']/a");
	private By dacha = By.xpath(".//*[@id='8261']/a");
	private By sport = By.xpath(".//*[@id='9017']/a");
	private By clothes = By.xpath(".//*[@id='10515']/a");
	private By beauty = By.xpath(".//*[@id='12258']/a");
	private By childGoods = By.xpath(".//*[@id='13224']/a");
	private By books = By.xpath(".//*[@id='14127']/a");
	private By alcohol = By.xpath(".//*[@id='14939']/a");
	private By businessGoods = By.xpath(".//*[@id='15422']/a");
	private By hotels = By.xpath(".//*[@id='15954']/a");


	public MainPageMenu(Webdriver driver){
		this.driver = driver;
	}
	public void openNotebook(){
		driver.findElement(notebook).click();
	}
	public void openPhones(){
		driver.findElement(phones).click();
	}
	public void openAppliances(){
		driver.findElement(appliances).click();
	}
	public void openHouseholdGoods(){
		driver.findElement(householdGoods).click();
	}
	public void openInstruments(){
		driver.findElement(instruments).click();
	}
	public void openSanitary(){
		driver.findElement(sanitary).click();
	}
	public void openDacha(){
		driver.findElement(dacha).click();
	}
	public void openSport(){
		driver.findElement(sport).click();
	}
	public void openClothes(){
		driver.findElement(clothes).click();
	}
	public void openBeauty(){
		driver.findElement(beauty).click();
	}
	public void openChildGoods(){
		driver.findElement(childGoods).click();
	}
	public void openBooks(){
		driver.findElement(books).click();
	}
	public void openAlcohol(){
		driver.findElement(alcohol).click();
	}
	public void openBusinessGoods(){
		driver.findElement(businessGoods).click();
	}
	public void openHotels(){
		driver.findElement(hotels).click();
	}
	
	
	}

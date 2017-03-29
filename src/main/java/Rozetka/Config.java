package Rozetka;

/**
 * Created by Andrew on 3/29/2017.
 */
public class Config {

    public static final String MAIN_PAGE_URL = "http://rozetka.com.ua";

    public static void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/geckodriver.exe");
    }

    private Config() {
    }
}
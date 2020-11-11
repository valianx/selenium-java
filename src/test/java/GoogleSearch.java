import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    final static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
      //  googleSearch();
        googleSearch2();
    }

    private static void googleSearch2() {
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        driver.get("https://www.google.com/");
        searchPageObj.setTextInSearchBox("test");
        searchPageObj.clickSearchButton();
        driver.close();
    }

    private static void googleSearch() {
        driver.get("https://www.google.com/");

        GoogleSearchElements.textbox_search(driver).sendKeys(("test"));
        GoogleSearchElements.button_search(driver).sendKeys(Keys.RETURN);

        driver.close();
        System.out.println("Test Completed Successfully");
    }

}

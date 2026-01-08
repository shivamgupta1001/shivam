package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct_galaxy = By.xpath("//*[@id='def47844-6eef-4978-88b1-a709d4f285c3']");
    By firstProduct_iphone = By.cssSelector("(//*[@id=\"02efcf63-66bb-4c5e-a15e-307a27ed1cc4\"]/div/div/span/div/div/div/div[2]/div");

    public void openFirstProduct() {
        driver.findElement(firstProduct_galaxy).click();
       
    }
    public void openFirstIphoneProduct() {
        driver.findElement(firstProduct_iphone).click();
    }   
}
////*[@id="def47844-6eef-4978-88b1-a709d4f285c3"]
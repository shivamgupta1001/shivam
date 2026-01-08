package pages;

import org.openqa.selenium.*;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By price = By.cssSelector("span.a-price-whole");
    By addToCartBtn = By.id("add-to-cart-button");

    public String getPrice() {
        return driver.findElement(price).getText();
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }
}

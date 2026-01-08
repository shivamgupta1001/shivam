package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class AmazonIphoneTest extends BaseTest {
    @Test
    public void addIphoneToCart() {
        HomePage home = new HomePage(driver);
        SearchResultsPage results = new SearchResultsPage(driver);
        ProductPage product = new ProductPage(driver);

        home.searchProduct("iPhone");
        results.openFirstIphoneProduct();

        System.out.println("iPhone Price: $" + product.getPrice());
        product.addToCart();
    }
}

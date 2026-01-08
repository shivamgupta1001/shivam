package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class AmazonGalaxyTest extends BaseTest {
    @Test
    public void addGalaxyToCart() {
        HomePage home = new HomePage(driver);
        SearchResultsPage results = new SearchResultsPage(driver);
        ProductPage product = new ProductPage(driver);

        home.searchProduct("Samsung Galaxy");
        results.openFirstProduct();

        System.out.println("Galaxy Price: $" + product.getPrice());
        product.addToCart();
    }
}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class ShoppingPage extends Utils {
    WebDriver driver;
    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }

    // elementos
    private String URL = "https://www.saucedemo.com/";

    // ações / funções / métodos
    public void que_estou_na_tela_de_compras() {
        logarSite();
        fazerLoginUserDefault();
    }

    public void adiciono_o_produto_no_carrinho (String produto) {
        String product_name = driver.findElement(By.className("inventory_item_name")).getText();
        //Assert.assertNotEquals(product_name, produto);
        Assert.assertEquals(product_name, produto);

        driver.findElement(By.id("add-to-cart-"+produto.toLowerCase().replace(" ", "-"))).click();
    }

    public void produto_e_adicionado_ao_carrinho () {
        Assert.assertNotNull(driver.findElement(By.className("shopping_cart_badge")));
    }

}

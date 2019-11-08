package telas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class ShoppingCartSummary extends QaDriver{
	public static void carrinhoComprar() {
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
		
		WebElement produto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p[1]/a[1]"));
		WebElement btn_carrinho_comprar = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"));
		
		assertEquals("Faded Short Sleeve T-shirts", produto.getText());
		btn_carrinho_comprar.click();
	
	}
}

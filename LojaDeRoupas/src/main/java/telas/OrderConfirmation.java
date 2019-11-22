package telas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class OrderConfirmation extends QaDriver{
	public static void confirmarPedido() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[1]")));
		
		WebElement confirmar_sucesso = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[1]"));
		assertEquals("Your order on My Store is complete.", confirmar_sucesso.getText());
	}
}

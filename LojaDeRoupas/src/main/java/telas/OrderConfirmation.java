package telas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class OrderConfirmation extends QaDriver{
	public static void confirmarPedido() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'I confirm my order')]")));
		
		WebElement confirmar_sucesso = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
		assertEquals("Your order on My Store is complete.", confirmar_sucesso.getText());
	}
}

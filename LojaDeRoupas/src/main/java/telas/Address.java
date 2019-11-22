package telas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Address extends QaDriver{
	public static void confirmarEndereco() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.name("processAddress")));
		
		WebElement endereco = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/li[4]"));
		WebElement btn_checkout = driver.findElement(By.name("processAddress"));
		
		assertEquals("Itapecerica, Alabama 00000", endereco.getText());
		btn_checkout.click();
	}
}
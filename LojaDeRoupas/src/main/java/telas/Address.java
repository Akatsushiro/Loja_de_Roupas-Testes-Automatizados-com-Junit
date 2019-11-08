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
		
		WebElement endereco = driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode'][contains(text(),'asdtgfc, Delaware 00000')]"));
		WebElement btn_checkout = driver.findElement(By.name("processAddress"));
		
		assertEquals("Itapecerica, Alabama 00000", endereco.getText());
		btn_checkout.click();
	}
}
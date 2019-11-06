package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Shipping extends QaDriver{
	public static void entrega() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]")));
		
		WebElement termos_de_servico = driver.findElement(By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]"));
		WebElement btn_checkout_go = driver.findElement(By.name("processCarrier"));
		
		termos_de_servico.click();
		btn_checkout_go.click();
	}
}

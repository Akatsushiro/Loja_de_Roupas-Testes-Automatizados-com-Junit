package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Address extends QaDriver{
	public static void confirmarEndereco() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.name("processAddress")));
		
		WebElement btn_checkout = driver.findElement(By.name("processAddress"));
		btn_checkout.click();
	}
}

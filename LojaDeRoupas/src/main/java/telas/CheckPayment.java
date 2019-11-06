package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class CheckPayment extends QaDriver{
	public static void checarPagamento() {
		new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'I confirm my order')]")));
		
		WebElement confirmar = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
		confirmar.click();
	}
}

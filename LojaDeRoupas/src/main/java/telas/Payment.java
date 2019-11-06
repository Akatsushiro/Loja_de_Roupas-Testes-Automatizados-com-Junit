package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Payment extends QaDriver{
	public static void pagamento() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='cheque']")));
		
		WebElement pagamento = driver.findElement(By.xpath("//a[@class='cheque']"));
		pagamento.click();
	}
}

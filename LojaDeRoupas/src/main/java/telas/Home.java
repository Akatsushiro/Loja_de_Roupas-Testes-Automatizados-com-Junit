package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Home extends QaDriver{
	
	public static void selecionarProduto()
	{
		driver.get("http://automationpractice.com/index.php");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")));
		
		WebElement card_roupa = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));
		//String produto = card_roupa.getText();
		card_roupa.click();
	}

}

package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class AddCar extends QaDriver{
	
	public static void adicionarAoCarrinho() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		WebElement btn_carrinho = driver.findElement(By.name("Submit"));
		btn_carrinho.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-default button button-medium']")));
		WebElement btn_carrinho_confirmar = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		btn_carrinho_confirmar.click();
	}
}

package telas;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class Authentication extends QaDriver{
	public static void autenticar() {
		
new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
		
		WebElement inp_email = driver.findElement(By.id("email_create"));
		WebElement btn_criar_conta = driver.findElement(By.id("SubmitCreate"));
		
		
		Random random = new Random();
		inp_email.sendKeys(random.nextInt(999999) + "Patrick@dantas.com");
		btn_criar_conta.click();
		
	}
}

package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexao.QaDriver;

public class CreateAccount extends QaDriver{
	public static void formularioCadastro(){
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(
				By.id("submitAccount")));
		
		WebElement sexo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]"));
		WebElement inp_nome = driver.findElement(By.id("customer_firstname"));
		WebElement inp_sobrenome = driver.findElement(By.id("customer_lastname"));
		WebElement inp_pass = driver.findElement(By.id("passwd"));
		WebElement inp_data_dia = driver.findElement(By.name("days"));
		WebElement inp_data_mes = driver.findElement(By.name("months"));
		Select inp_data_ano = new Select(driver.findElement(By.name("years")));
		
		
		sexo.click();
		inp_nome.sendKeys("Patrick");
		inp_sobrenome.sendKeys("Dantas");
		inp_pass.sendKeys("1234Br@");
		inp_data_dia.sendKeys("5");
		inp_data_mes.click();
		inp_data_mes.sendKeys("n");
		inp_data_mes.sendKeys(Keys.ENTER);
		inp_data_ano.selectByValue("1999");
		
		WebElement endereco = driver.findElement(By.id("address1"));
		WebElement cidade = driver.findElement(By.id("city"));
		Select estado = new Select(driver.findElement(By.id("id_state")));
		WebElement cep = driver.findElement(By.id("postcode"));
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		WebElement endereco_alternativo = driver.findElement(By.id("alias"));
		
		endereco.sendKeys("Rua pinho 666");
		cidade.sendKeys("Itapecerica");
		estado.selectByValue("1");
		cep.sendKeys("00000");
		mobile.sendKeys("999999999");
		endereco_alternativo.sendKeys("outro");
		
		WebElement cadastro_dados = driver.findElement(By.id("submitAccount"));
		cadastro_dados.click();
	}
}

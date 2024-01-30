package Teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import Page.LoginPage;
import Util.GerenciaDrivers;

public class TesteA {
	
	public static WebDriver driver;
	
	GerenciaDrivers gerenciadrivers; 
	
	LoginPage loginPage;
	
	@BeforeEach 
	public void inicio() {
	
		gerenciadrivers = new GerenciaDrivers();
		
		driver = GerenciaDrivers.initDriver("edge");
	
		loginPage = new LoginPage();
		
	}
	
	@Test
	public void testeA() {
		driver.get("https://www.saucedemo.com/");  
		loginPage.realizarLogin("standard_user", "secret_sauce");
	
	}

}

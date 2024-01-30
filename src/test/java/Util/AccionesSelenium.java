package Util;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccionesSelenium {

	public static void clic(WebDriver driver, By by, int tempo) {
		
		try {
			 
		   WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(tempo));
		   espera.until(ExpectedConditions.presenceOfElementLocated(by));
		   espera.until(ExpectedConditions.elementToBeClickable(by));

		   WebElement element = driver.findElement(by);
		   
		   element.click();
		   
		} catch (Exception e) {
			
			Assertions.fail("Error al intentar clicar no Elemento");
			
		}
	}

	public static void enviardados(WebDriver driver, By by, String valor,  int tempo) {
		
		try {
			   WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(tempo));
			   espera.until(ExpectedConditions.presenceOfElementLocated(by));
			   espera.until(ExpectedConditions.elementToBeClickable(by));

			   WebElement element = driver.findElement(by);

			   element.click();
			   element.clear();
			   element.sendKeys(valor);
			   
		} catch (Exception e) {
			Assertions.fail("Error al intentar clicar no enviardados");
		}
	}

	public static boolean elementoPresente(WebDriver driver, By by, int tempo) {
		
		try {
			   WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(tempo));
			   espera.until(ExpectedConditions.presenceOfElementLocated(by));
			   return true;
			   
		} catch (Exception e) {
				return false;
		}
		
	}
	
}

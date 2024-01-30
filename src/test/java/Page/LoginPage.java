package Page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.opentest4j.AssertionFailedError;
import static Teste.TesteA.driver;

import Util.AccionesSelenium;

public class LoginPage extends AccionesSelenium { 
	
		public static final By campoUsuario = By.xpath("//input[@id='user-name']");
		public static final By campoSenha = By.xpath("//input[@id='password']");
		public static final By btnenviar = By.xpath("//input[@id='login-button']");
		
public void realizarLogin(String usuario, String senha) {
	if (elementoPresente(driver, campoUsuario, 20)) {
		
		enviardados(driver, campoUsuario, usuario, 20);
		enviardados(driver, campoSenha, senha, 20);
		clic(driver, btnenviar, 20);
		
	}
	else {
		Assertions.fail("Error al tentar prencher usuario e senha");
		}
}
	
}

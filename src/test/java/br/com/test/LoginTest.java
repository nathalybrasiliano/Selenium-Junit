package br.com.test;

import br.com.seubarriga.Login;
import br.com.seubarriga.MenuPrincipal;
import org.junit.Test;

public class LoginTest extends Base {

    @Test
    public void LoginSucesso() {

        Login login = new Login(driver);
        driver.get("https://seubarriga.wcaquino.me/");
        login.EsperaTelaLogin();
        login.logar("nathaly.brasiliano@gft.com", "123@nath");
        MenuPrincipal menuPrincipal = new MenuPrincipal(driver);
        menuPrincipal.AguardarMenuPrincipal();

    }

}

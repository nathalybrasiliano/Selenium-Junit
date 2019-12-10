package br.com.test;

import br.com.seubarriga.Cadastro;
import com.github.javafaker.Faker;
import org.junit.Test;

import java.util.Locale;

public class CadastroTest extends Base {

    @Test
    public void CadastroSucesso() throws InterruptedException {

        Faker faker = new Faker(new Locale("pt-BR"));

       String nome = faker.harryPotter().character();
       String email = (faker.harryPotter().character().replace(" ", "") + "@gft.com");
       String senha = "123@nath";

        Cadastro cadastro = new Cadastro(driver);
        driver.get("https://seubarriga.wcaquino.me/cadastro");
        cadastro.cadastrar( nome, email, senha);
        Thread.sleep(3000);
        cadastro.EsperaTelaCadastro();
        cadastro.validarMensagemSucesso("Usuário inserido com sucesso");

    }

}

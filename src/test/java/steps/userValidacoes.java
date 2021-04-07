package steps;

import components.Components;
import io.cucumber.java.en.*;

public class userValidacoes extends Components {


    @Given("que seja acessado o endpoint {string}")
    public void queSejaAcessadoOEndpoint(String endpoint) {

        InitialEndpoint(endpoint);
    }


    @When("for validado o nome do usuario igual a {string}")
    public void forValidadoONomeDoUsuarioIgualA(String nomeUsuario) {

        ValidarValor(nomeUsuario);
    }

    @Then("a url do support sera igual a {string}")
    public void aUrlDoSupportSeraIgualA(String urlSupport) {

    }

}

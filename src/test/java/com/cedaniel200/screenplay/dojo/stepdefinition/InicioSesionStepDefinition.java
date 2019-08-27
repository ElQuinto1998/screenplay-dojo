package com.cedaniel200.screenplay.dojo.stepdefinition;

import com.cedaniel200.screenplay.dojo.model.Usuario;
import com.cedaniel200.screenplay.dojo.question.LaPaginaDeInicio;
import com.cedaniel200.screenplay.dojo.task.Autenticar;
import com.cedaniel200.screenplay.dojo.userinterface.InicioSesionPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InicioSesionStepDefinition {

    private InicioSesionPage inicioSesionPage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" quiere autenticarse$")
    public void quiereAutenticarse(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                Open.browserOn(inicioSesionPage)
        );
    }


    @When("^Cesar se autentica$")
    public void cesarSeAutentica() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Autenticar.alUsuario(new Usuario("personalQuinto@gmail.com", "anyo2017"))
        );
    }

    @Then("^Cesar debe ver la pagina de inicio$")
    public void cesarDebeVerLaPaginaDeInicio() {
        OnStage.theActorInTheSpotlight().should(seeThat(LaPaginaDeInicio.esVisible()));
    }



}

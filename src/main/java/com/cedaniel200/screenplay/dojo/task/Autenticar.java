package com.cedaniel200.screenplay.dojo.task;

import com.cedaniel200.screenplay.dojo.model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.cedaniel200.screenplay.dojo.userinterface.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    private Usuario usuario;

    public Autenticar(Usuario usuario){
        this.usuario = usuario;
    }

    public static Autenticar alUsuario(Usuario usuario) {
        return instrumented(Autenticar.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario.getUsuario()).into(CAMPO_USUARIO),
                Enter.theValue(usuario.getContraseña()).into(CAMPO_PASSWORD),
                Click.on(BOTON_SIGNIN)
        );

    }

}

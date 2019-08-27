package com.cedaniel200.screenplay.dojo.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.cedaniel200.screenplay.dojo.userinterface.PaginaInicioPage.CAMPO_ENCONTRAR_REPO;

public class LaPaginaDeInicio implements Question<Boolean> {

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CAMPO_ENCONTRAR_REPO.resolveFor(actor).isVisible();
    }
}

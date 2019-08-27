package com.cedaniel200.screenplay.dojo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://github.com/login")
public class InicioSesionPage extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("campo usuario").located(By.id("login_field"));
    public static final Target CAMPO_PASSWORD = Target.the("campo contraseña").located(By.id("password"));
    public static final Target BOTON_SIGNIN = Target.the("Boton ingresar").located(By.name("commit"));

}

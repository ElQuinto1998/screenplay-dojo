package com.cedaniel200.screenplay.dojo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioPage {

    public static final Target CAMPO_ENCONTRAR_REPO = Target.the("Encontrar repo").located(By.id("dashboard-repos-filter-left"));

}

package co.com.falabella.stepdefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaHomecenter.IMAGE_HOMECENTER;
import static co.com.falabella.pages.PaginaPrincipal.*;
import static co.com.falabella.pages.CabeceraPagina.*;

public class categoriaHomecenter {
    @Dado("{actor} comprueba que el boton Homecenter aparezca en la pagina principal")
    public void buscarElMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_HOMECENTER).isDisplayed()

        );
    }
    @Cuando("{actor} da click en el Homecenter")
    public void daClickEnLinio(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_HOMECENTER),
                Click.on(OK_SALTAR)
        );
    }
    @Entonces("{actor} esta en la pagina principal de Homecenter")
    public void estarEnLaPaginaDeLinio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(IMAGE_HOMECENTER).isDisplayed()
        );
    }
}

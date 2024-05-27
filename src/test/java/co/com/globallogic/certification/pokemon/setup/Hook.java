package co.com.globallogic.certification.pokemon.setup;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.globallogic.certification.pokemon.utils.Constantes.URL_BASE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast()); // Se inicializa el escenario
        theActorCalled("Malka");
        theActorInTheSpotlight().whoCan(CallAnApi.at(URL_BASE));
    }
}

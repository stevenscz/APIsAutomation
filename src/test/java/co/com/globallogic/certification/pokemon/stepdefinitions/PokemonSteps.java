package co.com.globallogic.certification.pokemon.stepdefinitions;

import co.com.globallogic.certification.pokemon.models.DataPokemon;
import co.com.globallogic.certification.pokemon.questions.ObtenerPokemones;
import co.com.globallogic.certification.pokemon.tasks.GetPokemon;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.CoreMatchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PokemonSteps {
    @Cuando("El usuario llama a la API de Pokemon")
    public void elUsuarioLlamaALaAPIDePokemon() {
    theActorInTheSpotlight().attemptsTo(GetPokemon.getPokemon());

    }
    @Entonces("Deberia ver el cuerpo del JSON exitosamente")
    public void deberiaVerElCuerpoDelJSONExitosamente() {
       // DataPokemon dataPokemon = SerenityRest.lastResponse().jsonPath().getObject("", DataPokemon.class);
        // String Poke = dataPokemon.
       theActorInTheSpotlight().should(seeThat("El nombre del pokemon es correcto", act -> new ObtenerPokemones().answeredBy(theActorInTheSpotlight()), equalTo("black-2")));
    }
}

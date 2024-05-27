package co.com.globallogic.certification.pokemon.questions;

import co.com.globallogic.certification.pokemon.models.DataPokemon;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ObtenerPokemones implements Question {

    @Override
    public String answeredBy(Actor actor) {
        //return SerenityRest.lastResponse().as(DataPokemon.class);
        return SerenityRest.lastResponse().jsonPath().get("name").toString();
    }
}

package co.com.globallogic.certification.pokemon.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.globallogic.certification.pokemon.utils.Constantes.URL_POKEMON;

public class GetPokemon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset(); // Resetear los llamados de las APIs
        actor.attemptsTo(
                Get.resource(String.format(URL_POKEMON))
                        .with(request -> request.header("Content-Type", "application/json"))

        );
        System.out.println("Código de respuesta: " + SerenityRest.lastResponse().statusCode());
        System.out.println("Cuerpo de la respuesta: " + SerenityRest.lastResponse().body().asString());
    }

    public static GetPokemon getPokemon() {
        return Tasks.instrumented(GetPokemon.class);
    }
}

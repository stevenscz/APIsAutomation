package co.com.globallogic.certification.pokemon.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/get_pokemon.feature",
        //tags = "@Comprar",
        glue = {"co/com/globallogic/certification/pokemon/stepdefinitions",
                "co/com/globallogic/certification/pokemon/setup"},

        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Pokemon {
}

package co.com.globallogic.certification.pokemon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Name {

    @SerializedName("language")
    @Expose
    private Language language;
    @SerializedName("name")
    @Expose
    private String name;


}

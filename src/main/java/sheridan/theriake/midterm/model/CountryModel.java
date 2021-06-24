package sheridan.theriake.midterm.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class CountryModel implements Serializable {

    private int id = 0;
    private String name = "";
    private String continent = "";
    private String region = "";
    private double surfaceArea = 0.00;
    private int population = 0;

//    public CountryModel(int id, String name, String continent, String region, double surfaceArea, int population){
//        this.id = id;
//        this.name = name;
//        this.continent = continent;
//        this.region = region;
//        this.surfaceArea = surfaceArea;
//        this.population = population;
//    }
}

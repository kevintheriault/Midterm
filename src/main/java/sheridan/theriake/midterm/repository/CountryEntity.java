package sheridan.theriake.midterm.repository;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class CountryEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name = "";

    @Column(name = "continent")
    private String continent = "";

    @Column(name = "region")
    private String region = "";

    @Column(name = "surface_area")
    private double surfaceArea = 0.0;

    @Column(name = "population")
    private int population = 0;


}

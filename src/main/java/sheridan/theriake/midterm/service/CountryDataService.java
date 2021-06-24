package sheridan.theriake.midterm.service;

import sheridan.theriake.midterm.model.CountryModel;
import java.util.List;


public interface CountryDataService {

    List<CountryModel>getAllCountries();

    CountryModel getCountryData(int id);

}

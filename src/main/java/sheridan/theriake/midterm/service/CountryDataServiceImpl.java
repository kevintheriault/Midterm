package sheridan.theriake.midterm.service;

import org.springframework.stereotype.Service;
import sheridan.theriake.midterm.model.CountryModel;
import sheridan.theriake.midterm.repository.CountryDataRepository;
import sheridan.theriake.midterm.repository.CountryEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryDataServiceImpl implements CountryDataService{

    private CountryDataRepository countryDataRepository;

    CountryDataServiceImpl(CountryDataRepository countryDataRepository){
        this.countryDataRepository = countryDataRepository;
    }

    private static void copyEntitytoModel(CountryEntity country, CountryModel model){
        model.setId(country.getId());
        model.setName(country.getName());
        model.setContinent(country.getContinent());
        model.setPopulation(country.getPopulation());
        model.setRegion(country.getRegion());
        model.setSurfaceArea(country.getSurfaceArea());
    }


    public List<CountryModel> getAllCountries(){
        List<CountryModel> modelList = new ArrayList<>();
        List<CountryEntity> entityList = countryDataRepository.findAll();
        for(CountryEntity country: entityList){
            CountryModel countryModel = new CountryModel();
            copyEntitytoModel(country, countryModel);
            modelList.add(countryModel);
        }
        return modelList;
    }

    public CountryModel getCountryData(int id){
        Optional<CountryEntity> result = countryDataRepository.findById(id);
        if(result.isPresent()){
            CountryModel model = new CountryModel();
            CountryEntity country = result.get();
            copyEntitytoModel(country, model);
            return model;
        }
        return null;
    }

}

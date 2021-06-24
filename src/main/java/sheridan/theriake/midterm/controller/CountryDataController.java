package sheridan.theriake.midterm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import sheridan.theriake.midterm.model.CountryModel;
import sheridan.theriake.midterm.service.CountryDataService;

import java.util.List;

@Controller
@Slf4j
public class CountryDataController {

    private final CountryDataService countryDataService;

    public CountryDataController(CountryDataService countryDataService){
        this.countryDataService = countryDataService;
    }

    @GetMapping(value={"/", "/CountryList"})
    public ModelAndView listCountries(){
        log.trace("listCountries() was called.");
        List<CountryModel> countryList = countryDataService.getAllCountries();
        return new ModelAndView("CountryList", "countries", countryList);
    }

    @GetMapping("/CountryDetails/{id}")
    public String countryDetails(@PathVariable String id, Model model){
        log.trace("countryDetails() was called.");
        try{
            CountryModel countryModel = countryDataService.getCountryData(Integer.parseInt(id));

            if(countryModel != null){
                model.addAttribute("country", countryModel);
                log.trace("Country with id " + id + " data displayed");
                return "CountryDetails";
            }else{
                log.trace("The country ID did not exit.");
                return "/MissingData";
            }
        }catch(NumberFormatException e){
            log.trace("URL Contains non int path variable");
            return "/MissingData";
        }
    }
}

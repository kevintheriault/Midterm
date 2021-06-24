package sheridan.theriake.midterm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sheridan.theriake.midterm.service.CountryDataService;

@Controller
@Slf4j
public class CountryDataController {

    private final CountryDataService countryDataService;

    public CountryDataController(CountryDataService countryDataService){
        this.countryDataService = countryDataService;
    }

    @GetMapping("/CountryList")
    public ModelAndView listCountries(){
        log.trace("listCountries() was called.");
        return new ModelAndView();
    }
}

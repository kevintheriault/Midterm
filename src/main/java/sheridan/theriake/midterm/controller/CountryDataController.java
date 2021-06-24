package sheridan.theriake.midterm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class CountryDataController {

    private final CountryDataService countryDataService;

    @GetMapping("/CountryList")
    public ModelAndView listCountries(){
        log.trace("listCountries() was called.");
        return new ModelAndView()
    }
}

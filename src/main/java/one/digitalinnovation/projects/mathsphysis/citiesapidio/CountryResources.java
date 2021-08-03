package one.digitalinnovation.projects.mathsphysis.citiesapidio;

import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity.Country;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryResources {

    private final CountryService countryService;

    @GetMapping
    public List<Country> countries() {
        return countryService.listAll();
    }
}

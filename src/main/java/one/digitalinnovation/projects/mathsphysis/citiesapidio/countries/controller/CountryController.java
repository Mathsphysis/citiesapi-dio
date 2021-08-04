package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity.Country;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.exception.CountryIDNotFoundException;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public Page<Country> listCountries(Pageable page) {
        return countryService.countries(page);
    }

    @GetMapping("/{id}")
    public Country getOneCountry(@PathVariable Long id) throws CountryIDNotFoundException {
        return countryService.getOne(id);
    }
}

package one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.controller;


import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.entity.CountryState;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.service.CountryStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countrystates")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryStateController {

    private final CountryStateService countryStateService;

    @GetMapping
    public Page<CountryState> listCountryStates(Pageable page) {
        return countryStateService.listAll(page);
    }
}

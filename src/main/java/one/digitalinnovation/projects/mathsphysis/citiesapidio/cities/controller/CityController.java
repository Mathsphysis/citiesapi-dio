package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.entity.City;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

    private CityService cityService;

    @GetMapping
    public Page<City> listCities(Pageable page) {
        return cityService.listAll(page);
    }
}

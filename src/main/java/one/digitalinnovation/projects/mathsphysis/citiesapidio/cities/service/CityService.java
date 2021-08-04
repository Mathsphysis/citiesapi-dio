package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.entity.City;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {

    private CityRepository cityRepository;

    public Page<City> listAll(Pageable page) {
        return cityRepository.findAll(page);
    }
}

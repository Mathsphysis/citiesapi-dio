package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity.Country;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> listAll() {
        return countryRepository.findAll();
    }
}

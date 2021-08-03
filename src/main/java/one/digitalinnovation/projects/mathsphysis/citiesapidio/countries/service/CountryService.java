package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity.Country;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.exception.CountryIDNotFoundException;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    private final CountryRepository countryRepository;

    public Page<Country> countries(Pageable page) {
        return countryRepository.findAll(page);
    }

    public Country getOne( Long id) throws CountryIDNotFoundException {
        Country country = countryRepository.findById(id).orElseThrow(() -> new CountryIDNotFoundException(id));

        return country;
    }
}

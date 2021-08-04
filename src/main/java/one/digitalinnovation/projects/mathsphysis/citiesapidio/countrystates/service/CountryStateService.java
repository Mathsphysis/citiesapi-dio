package one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.service;


import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.entity.CountryState;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.countrystates.repository.CountryStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryStateService {

    private final CountryStateRepository countryStateRepository;

    public Page<CountryState> listAll(Pageable page) {
        return countryStateRepository.findAll(page);
    }
}

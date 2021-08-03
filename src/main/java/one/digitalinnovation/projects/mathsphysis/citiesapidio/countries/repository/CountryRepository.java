package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.repository;

import one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

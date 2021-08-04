package one.digitalinnovation.projects.mathsphysis.citiesapidio.countries.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryIDNotFoundException extends Exception{
    public CountryIDNotFoundException(Long id) {
        super("Country with ID: " + id + " not found.");
    }
}

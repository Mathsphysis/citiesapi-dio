package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.service;


import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.entity.City;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceService {

    private final CityRepository cityRepository;

    public Double distanceUsingPoints(final long cityFrom, final Long cityTo) {
        return cityRepository.distanceByPoints(cityFrom, cityTo);
    }

    public Double distanceUsingCube( Long cityFrom,  Long cityTo) {
//        Point pointFrom = cityRepository.findPointById(cityFrom);
//        Point pointTo = cityRepository.findPointById(cityTo);

        final List<City> cityList = cityRepository.findAllById(Arrays.asList(cityFrom, cityTo));

        Point pointFrom = cityList.get(0).getGeolocation();
        Point pointTo = cityList.get(1).getGeolocation();

        return cityRepository.distanceByCube(pointFrom.getX(), pointFrom.getY(), pointTo.getX(), pointTo.getY());
    }
}

package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.repository;

import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.entity.City;
import org.springframework.data.geo.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
    Double distanceByPoints(final Long cityFrom, final Long cityTo);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) as distance", nativeQuery = true)
    Double distanceByCube(final Double latFrom, final Double lonFrom, final Double latTo, final Double lonTo);

    @Query(value = "SELECT lat_lon FROM cidade WHERE id=?1", nativeQuery = true)
    Point findPointById(Long cityId);
}

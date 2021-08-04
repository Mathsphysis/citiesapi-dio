package one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.projects.mathsphysis.citiesapidio.cities.service.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distance")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceController {

    private final DistanceService distanceService;

//    Logger log;

    @GetMapping("/by-points")
    public Double distanceByPoints(@RequestParam(name = "from") Long cityFrom, @RequestParam(name = "to") Long cityTo){
        return distanceService.distanceUsingPoints(cityFrom, cityTo);
    }

    @GetMapping("/by-cube")
    public Double distanceByCube(@RequestParam(name = "from") Long cityFrom, @RequestParam(name = "to") Long cityTo) {
        return distanceService.distanceUsingCube(cityFrom, cityTo);
    }
}

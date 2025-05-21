
package br.dev.mika.airports.controllers;

import br.dev.mika.airports.entities.Airport;
import br.dev.mika.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author ppjatb
 */
@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    @GetMapping("/airport")
    public List<Airport> findAll () {
        List<Airport> result = airportService.findAll();
        return result;
    }
}

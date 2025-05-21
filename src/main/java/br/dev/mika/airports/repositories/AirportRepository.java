
package br.dev.mika.airports.repositories;

import br.dev.mika.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjatb
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}

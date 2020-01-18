package edu.kit.tm.cm.scdm.vehicle;

import edu.kit.tm.cm.scdm.vehicle.domain.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VehicleMicroservice {

    /**
     * Initializes and starts the SpringBoot application
     *
     * @param args CLI Parameter
     */
    public static void main(String[] args) {
        SpringApplication.run(VehicleMicroservice.class, args);
    }

    /**
     * Generate vehicle with its static data
     *
     * @return Generated vehicle
     */
    @Bean(name = "vehicle")
    public Vehicle generateVehicle() {
        return new Vehicle();
    }
}

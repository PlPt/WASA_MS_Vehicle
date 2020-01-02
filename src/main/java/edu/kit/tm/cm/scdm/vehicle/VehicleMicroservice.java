package edu.kit.tm.cm.scdm.vehicle;

import edu.kit.tm.cm.scdm.vehicle.domain.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehicleMicroservice {

    /***
     * Initializes the complete SpringBoot framework and starts the application
     * @param args CLI Parameter
     */
    public static void main(String[] args) {
        SpringApplication.run(VehicleMicroservice.class, args);
    }

    @Bean(name = "vehicle")
    public Vehicle generateVehicle() {
        return new Vehicle();
    }
}

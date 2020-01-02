package edu.kit.tm.cm.scdm.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleMicroservice {

    /***
     * Initializes the complete SpringBoot framework and starts the application
     * @param args CLI Parameter
     */
    public static void main(String[] args) {
        SpringApplication.run(VehicleMicroservice.class, args);
    }

}

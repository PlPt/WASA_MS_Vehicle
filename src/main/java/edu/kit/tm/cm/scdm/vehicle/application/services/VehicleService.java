package edu.kit.tm.cm.scdm.vehicle.application.services;

import edu.kit.tm.cm.scdm.vehicle.domain.model.DynamicVehicleData;
import edu.kit.tm.cm.scdm.vehicle.domain.model.StaticVehicleData;
import edu.kit.tm.cm.scdm.vehicle.domain.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private Vehicle vehicle;

    /**
     * Initializes the VehicleService via dependency injection
     *
     * @param vehicle Current vehicle
     */
    @Autowired
    public VehicleService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Returns static data of the vehicle
     *
     * @return StaticVehicleData
     */
    public StaticVehicleData getStaticVehicleData() {
        return vehicle.getStaticVehicleData();
    }

    /**
     * Returns generated dynamic data of the vehicle
     *
     * @return DynamicVehicleData
     */
    public DynamicVehicleData getDynamicVehicleData() {
        return vehicle.getDynamicVehicleData();
    }
}

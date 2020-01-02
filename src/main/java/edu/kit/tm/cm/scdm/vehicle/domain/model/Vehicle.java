package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;

@Getter
public class Vehicle {
    private StaticVehicleData staticVehicleData;
    private DynamicVehicleData dynamicVehicleData;

    public Vehicle() {
        String vin = RandomStringUtils.randomAlphanumeric(17).toUpperCase(); //ISO 3779: VIN has 17 characters
        this.staticVehicleData = new StaticVehicleData(vin);
        this.dynamicVehicleData = new DynamicVehicleData(vin);
    }
}

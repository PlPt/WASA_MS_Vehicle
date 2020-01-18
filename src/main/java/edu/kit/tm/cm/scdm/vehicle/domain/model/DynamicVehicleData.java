package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.time.Instant;

@Getter
public class DynamicVehicleData {
    private final Vehicle vehicle;
    private Coordinate position;
    private double tankLevel;
    private double oilPressure;
    private double tirePressure;
    private String timestamp;

    public DynamicVehicleData(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getVin() {
        return vehicle.getStaticVehicleData().getVin();
    }

    public void update() {
        position = new Coordinate(RandomUtils.nextDouble(49, 50), RandomUtils.nextDouble(8, 9));
        tankLevel = RandomUtils.nextFloat(0, 1) * vehicle.getStaticVehicleData().getTankCapacity();
        oilPressure = RandomUtils.nextDouble(1, 3);
        tirePressure = RandomUtils.nextDouble(1.5, 4);
        timestamp = Instant.now().toString();
    }
}

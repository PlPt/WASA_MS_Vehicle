package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.time.Instant;

@Getter
public class DynamicVehicleData {
    private final String vin;

    public DynamicVehicleData(String vin) {
        this.vin = vin;
    }

    public Coordinate getPosition() {
        return new Coordinate(RandomUtils.nextDouble(49, 50), RandomUtils.nextDouble(8, 9));
    }

    public String getTankLevel() {
        return RandomUtils.nextFloat(0, 1) + "%";
    }

    public double getOilPressure() {
        return RandomUtils.nextDouble(1, 3);
    }

    public double getTirePressure() {
        return RandomUtils.nextDouble(1.5, 4);
    }

    public String getTimestamp() {
        return Instant.now().toString();
    }
}

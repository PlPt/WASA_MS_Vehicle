package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.time.Instant;

@Getter
public class DynamicVehicleData {
    private final Vehicle vehicle;

    public DynamicVehicleData(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getVin() {
        return vehicle.getStaticVehicleData().getVin();
    }

    public Coordinate getPosition() {
        return new Coordinate(RandomUtils.nextDouble(49, 50), RandomUtils.nextDouble(8, 9));
    }

    public double getTankLevel() {
        return RandomUtils.nextFloat(0, 1) * vehicle.getStaticVehicleData().getTankCapacity();
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

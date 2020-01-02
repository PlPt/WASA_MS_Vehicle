package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

@Getter
public class StaticVehicleData {
    private final String vin;
    private final String tag;
    private final VehicleType type;
    private final String model;
    private final int seats;
    private final int tankCapacity;

    public StaticVehicleData(String vin) {
        this.vin = vin;
        this.tag = (RandomStringUtils.randomAlphabetic(1, 4) + "-" + RandomStringUtils.randomAlphabetic(1, 3)
                + "-" + RandomStringUtils.randomNumeric(1, 5)).toUpperCase();
        this.type = VehicleType.randomType();
        this.model = RandomStringUtils.randomAlphanumeric(5, 10);
        this.seats = RandomUtils.nextInt(2, 8);
        this.tankCapacity = RandomUtils.nextInt(40, 70);
    }
}

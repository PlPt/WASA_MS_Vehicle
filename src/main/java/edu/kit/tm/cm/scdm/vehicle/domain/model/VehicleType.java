package edu.kit.tm.cm.scdm.vehicle.domain.model;

import org.apache.commons.lang3.RandomUtils;

public enum VehicleType {
    ELECTRIC, DIESEL, GASOLINE;

    public static VehicleType randomType() {
        int x = RandomUtils.nextInt(0, VehicleType.class.getEnumConstants().length);
        return VehicleType.class.getEnumConstants()[x];
    }
}

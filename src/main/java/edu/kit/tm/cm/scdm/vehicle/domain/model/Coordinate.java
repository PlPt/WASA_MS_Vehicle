package edu.kit.tm.cm.scdm.vehicle.domain.model;

import lombok.Getter;

@Getter
public class Coordinate {
    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

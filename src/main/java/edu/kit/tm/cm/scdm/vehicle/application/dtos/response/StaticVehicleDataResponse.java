package edu.kit.tm.cm.scdm.vehicle.application.dtos.response;

import edu.kit.tm.cm.scdm.vehicle.domain.model.VehicleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("StaticVehicleData")
public class StaticVehicleDataResponse {
    @ApiModelProperty(position = 1)
    String vin;

    @ApiModelProperty(position = 2)
    String tag;

    @ApiModelProperty(position = 3)
    String model;

    @ApiModelProperty(position = 4)
    VehicleType type;

    @ApiModelProperty(position = 5)
    int seats;

    @ApiModelProperty(position = 6)
    int tankCapacity;
}

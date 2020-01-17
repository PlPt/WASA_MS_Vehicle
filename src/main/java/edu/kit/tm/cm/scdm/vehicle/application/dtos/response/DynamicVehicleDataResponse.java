package edu.kit.tm.cm.scdm.vehicle.application.dtos.response;

import edu.kit.tm.cm.scdm.vehicle.domain.model.Coordinate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("DynamicVehicleData")
public class DynamicVehicleDataResponse {
    @ApiModelProperty(position = 1)
    String vin;

    @ApiModelProperty(position = 2)
    Coordinate position;

    @ApiModelProperty(position = 3)
    String tankLevel;

    @ApiModelProperty(position = 4)
    double oilPressure;

    @ApiModelProperty(position = 5)
    double tirePressure;

    @ApiModelProperty(position = 6)
    String timestamp;
}

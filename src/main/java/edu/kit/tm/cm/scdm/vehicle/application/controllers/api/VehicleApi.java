package edu.kit.tm.cm.scdm.vehicle.application.controllers.api;

import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.DynamicVehicleDataResponse;
import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.StaticVehicleDataResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/v1")
public interface VehicleApi {

    /**
     * Returns static data of the vehicle
     *
     * @return StaticVehicleDataResponse with static data
     */
    @GetMapping("/static-data")
    @ApiOperation(value = "Get static data of the vehicle")
    StaticVehicleDataResponse getStaticVehicleData();

    /**
     * Returns dynamic data of the vehicle
     *
     * @return DynamicVehicleDataResponse with generated dynamic data
     */
    @GetMapping("/dynamic-data")
    @ApiOperation(value = "Get dynamic data of the vehicle")
    DynamicVehicleDataResponse getDynamicVehicleData();
}

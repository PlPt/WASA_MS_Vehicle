package edu.kit.tm.cm.scdm.vehicle.application.controllers;

import edu.kit.tm.cm.scdm.vehicle.application.controllers.api.VehicleApi;
import edu.kit.tm.cm.scdm.vehicle.application.dtos.DynamicDataMapper;
import edu.kit.tm.cm.scdm.vehicle.application.dtos.StaticDataMapper;
import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.DynamicVehicleDataResponse;
import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.StaticVehicleDataResponse;
import edu.kit.tm.cm.scdm.vehicle.application.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VehicleController implements VehicleApi {

    private final VehicleService vehicleService;
    private final StaticDataMapper staticDataMapper;
    private final DynamicDataMapper dynamicDataMapper;

    /**
     * Initializes the VehicleController via dependency injection
     *
     * @param vehicleService    The VehicleService
     * @param staticDataMapper  Mapper between StaticVehicleData and StaticVehicleDataResponse
     * @param dynamicDataMapper Mapper between DynamicVehicleData and DynamicVehicleDataResponse
     */
    @Autowired
    public VehicleController(VehicleService vehicleService, StaticDataMapper staticDataMapper,
                             DynamicDataMapper dynamicDataMapper) {
        this.vehicleService = vehicleService;
        this.staticDataMapper = staticDataMapper;
        this.dynamicDataMapper = dynamicDataMapper;
    }

    @Override
    public StaticVehicleDataResponse getStaticVehicleData() {
        return staticDataMapper.toResponse(vehicleService.getStaticVehicleData());
    }

    @Override
    public DynamicVehicleDataResponse getDynamicVehicleData() {
        return dynamicDataMapper.toResponse(vehicleService.getDynamicVehicleData());
    }
}

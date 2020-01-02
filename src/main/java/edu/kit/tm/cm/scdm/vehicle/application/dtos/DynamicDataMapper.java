package edu.kit.tm.cm.scdm.vehicle.application.dtos;

import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.DynamicVehicleDataResponse;
import edu.kit.tm.cm.scdm.vehicle.domain.model.DynamicVehicleData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DynamicDataMapper {
    DynamicVehicleDataResponse toResponse(DynamicVehicleData dynamicVehicleData);
}

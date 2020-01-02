package edu.kit.tm.cm.scdm.vehicle.application.dtos;

import edu.kit.tm.cm.scdm.vehicle.application.dtos.response.StaticVehicleDataResponse;
import edu.kit.tm.cm.scdm.vehicle.domain.model.StaticVehicleData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StaticDataMapper {
    StaticVehicleDataResponse toRespone(StaticVehicleData staticVehicleData);
}

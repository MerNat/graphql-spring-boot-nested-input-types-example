package com.mernat.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mernat.graphql.dao.entity.Vehicle;
import com.mernat.graphql.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private GlobalService globalService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate, final Integer color) {
        return this.globalService.createVehicle(type, modelCode, brandName, launchDate, color);
    }
}

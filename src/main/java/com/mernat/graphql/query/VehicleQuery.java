package com.mernat.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.mernat.graphql.dao.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private com.mernat.graphql.service.GlobalService globalService;

    public List<Vehicle> getVehicles(final int count) {
        return this.globalService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.globalService.getVehicle(id);
    }
}

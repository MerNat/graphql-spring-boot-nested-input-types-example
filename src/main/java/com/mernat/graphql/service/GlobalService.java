package com.mernat.graphql.service;

import com.mernat.graphql.dao.entity.Color;
import com.mernat.graphql.dao.entity.Vehicle;
import com.mernat.graphql.dao.repository.ColorRepository;
import com.mernat.graphql.dao.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GlobalService {

    private final VehicleRepository vehicleRepository ;
    private final ColorRepository colorRepository;

    public GlobalService(final VehicleRepository vehicleRepository,final ColorRepository colorRepository) {
        this.vehicleRepository = vehicleRepository;
        this.colorRepository = colorRepository;
    }

    @Transactional
    public Color createColor(final String name){
        final Color color = new Color();
        color.setName(name);
        return this.colorRepository.save(color);
    }

    @Transactional(readOnly = true)
    public List<Color> getAllColors(final int count){
        return this.colorRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Color> getColor(final int id){
        return this.colorRepository.findById(id);
    }

    @Transactional
    public Vehicle createVehicle(final String type,final String modelCode, final String brandName, final String launchDate, final Integer color) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        vehicle.setColor(this.colorRepository.findById(color).orElse(null));
        return this.vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleRepository.findById(id);
    }
}

package com.mernat.graphql.service;

import com.mernat.graphql.dao.entity.*;
import com.mernat.graphql.dao.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GlobalService {

    private final VehicleRepository vehicleRepository;
    private final ColorRepository colorRepository;
    private final PatientRepository patientRepository;
    private final BioRepository bioRepository;
    private final ContactRepository contactRepository;

    public GlobalService(
            final VehicleRepository vehicleRepository,
            final ColorRepository colorRepository,
            final PatientRepository patientRepository,
            final BioRepository bioRepository,
            final ContactRepository contactRepository
    ) {
        this.vehicleRepository = vehicleRepository;
        this.colorRepository = colorRepository;
        this.patientRepository = patientRepository;
        this.bioRepository = bioRepository;
        this.contactRepository = contactRepository;
    }

    @Transactional
    public Color createColor(final String name) {
//        System.out.println(ExternalService.getUsers()[0].getName());
//        System.out.println(ExternalService.getUsers()[1].getUserId());
        final Color color = new Color();
        color.setName(name);
        return this.colorRepository.save(color);
    }

    @Transactional
    public Color updateColor(final int id, final String name) {
        Color colorInstance = this.colorRepository.findById(id).orElse(null);
        colorInstance.setName(name);
        return this.colorRepository.save(colorInstance);
    }

    @Transactional(readOnly = true)
    public List<Color> getAllColors(final int count) {
        return this.colorRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Color> getColor(final int id) {
        return this.colorRepository.findById(id);
    }

    @Transactional()
    public boolean deleteColor(final int id) {
        final Color color = this.colorRepository.findById(id).orElse(null);
        if (color == null) {
            return false;
        }
        this.colorRepository.deleteById(id);
        return true;
    }


    @Transactional
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate, final Integer color) {
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

    // Creating a patient
    @Transactional
    public List<Patient> createPatients(final List<Patient> patients) {
        for (Patient patient : patients) {
            if (!this.checkNull(patient.getBio())) {
                this.bioRepository.save(patient.getBio());
                if (!this.checkNull(patient.getBio().getContact())) {
                    this.contactRepository.save(patient.getBio().getContact());
                }
            }
            this.patientRepository.save(patient);
        }
        return patients;
    }

    @Transactional(readOnly = true)
    public List<Patient> getPatients() {
        return this.patientRepository.findAll().stream().collect(Collectors.toList());
    }

    private boolean checkNull(Object ob) {
        if (ob == null) {
            return true;
        }
        return false;
    }
}

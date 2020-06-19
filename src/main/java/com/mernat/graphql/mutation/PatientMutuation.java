package com.mernat.graphql.mutation;

import com.mernat.graphql.dao.entity.Patient;
import graphql.kickstart.tools.GraphQLMutationResolver;
import com.mernat.graphql.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientMutuation implements GraphQLMutationResolver {
    @Autowired
    private GlobalService globalService;

    public List<Patient> createPatient(final List<Patient> patient){
        return this.globalService.createPatient(patient);
    }
}

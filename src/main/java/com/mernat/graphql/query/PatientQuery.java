package com.mernat.graphql.query;

import com.mernat.graphql.dao.entity.Patient;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientQuery implements GraphQLQueryResolver {

    @Autowired
    private com.mernat.graphql.service.GlobalService globalService;

    public List<Patient> getPatients(){
        return this.globalService.getPatients();
    }
}

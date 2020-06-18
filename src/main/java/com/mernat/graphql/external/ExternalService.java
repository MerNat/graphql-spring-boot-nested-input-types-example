package com.mernat.graphql.external;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExternalService {
    final static RestTemplate restTemplate = new RestTemplate();


    public static User[] getUsers(){
        //Example to fetch users from localhost and print the first one.
        ResponseEntity<User[]> response = restTemplate.getForEntity("http://localhost:3000/users", User[].class);
        User[] employees = response.getBody();
        return employees;
    }
}

package com.mernat.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Contact implements Serializable {
    @Id
    @Column(name = "contact_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "emergency_number", nullable = false)
    private String emergencyNumber;
}

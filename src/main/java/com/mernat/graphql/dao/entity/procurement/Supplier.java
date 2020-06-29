package com.mernat.graphql.dao.entity.procurement;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
public class Supplier implements Serializable {
    @Id
    @Column(name = "vat_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "last_changed")
    private Date lastChanged;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "organization", nullable = false)
    private Integer organization;
}

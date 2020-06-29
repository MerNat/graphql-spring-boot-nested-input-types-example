package com.mernat.graphql.dao.entity.procurement;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class VAT implements Serializable {
    @Id
    @Column(name = "vat_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "percentage")
    private Float percentage;

    @Column(name = "description")
    private String description;

    @Column(name = "organization", nullable = false)
    private Integer organization;
}

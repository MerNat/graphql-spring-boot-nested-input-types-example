package com.mernat.graphql.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;


@Data
@EqualsAndHashCode
@Entity
public class Patient implements Serializable {
    @Id
    @Column(name = "patient_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "bio_id",
            nullable = true, updatable = true)
    private Bio bio;
}

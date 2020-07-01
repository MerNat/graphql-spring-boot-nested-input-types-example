package com.mernat.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@EqualsAndHashCode
@Entity
public class Bio implements Serializable {
    @Id
    @Column(name = "bio_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "birth_date", nullable = false)
    private String birthDate;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Contact> contacts;
}

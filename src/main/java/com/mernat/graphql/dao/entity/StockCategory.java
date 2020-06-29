package com.mernat.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class StockCategory implements Serializable {
    @Id
    @Column(name = "stock_cat_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "organization", nullable = false)
    private Integer organization;

    @ManyToOne()
    @JoinColumn(name = "stock_type_id",
            nullable = true, updatable = true)
    private StockType stockType;
}

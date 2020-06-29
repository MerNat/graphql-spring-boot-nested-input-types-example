package com.mernat.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Item implements Serializable {
    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "item_number")
    private String itemNumber;

    @Column(name = "optimal_quantity")
    private Integer optimalQuantity;

    @Column(name = "unit")
    private String unit;

    @Column(name = "organization", nullable = false)
    private Integer organization;

    @ManyToOne()
    @JoinColumn(name = "stock_type_id",
            nullable = true, updatable = true)
    private StockType stockType;

    @ManyToOne()
    @JoinColumn(name = "stock_cat_id",
            nullable = true, updatable = true)
    private StockCategory stockCategory;
}

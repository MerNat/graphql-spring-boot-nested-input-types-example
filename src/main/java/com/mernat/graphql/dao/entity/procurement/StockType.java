package com.mernat.graphql.dao.entity.procurement;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class StockType implements Serializable {
    @Id
    @Column(name = "stock_type_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "organization", nullable = false)
    private Integer organization;
}

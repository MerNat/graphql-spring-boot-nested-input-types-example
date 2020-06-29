package com.mernat.graphql.dao.entity.procurement;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
public class Stock implements Serializable {
    @Id
    @Column(name = "stock_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "batch_no")
    private String batchNumber;

    @Column(name = "dose")
    private String dose;

    @Column(name = "form")
    private String form;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "sales_price_per_unit", nullable = false)
    private Float salesPricePerUnit;

    @ManyToOne()
    @JoinColumn(name = "item_id",
            nullable = true)
    private Item item;

    @ManyToOne()
    @JoinColumn(name = "supplier_id",
            nullable = true)
    private Supplier supplier;

    @ManyToOne()
    @JoinColumn(name = "vat_id",
            nullable = true)
    private VAT vat;

    @Column(name = "organization", nullable = false)
    private Integer organization;
}

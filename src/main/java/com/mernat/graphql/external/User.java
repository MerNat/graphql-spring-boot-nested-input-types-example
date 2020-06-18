package com.mernat.graphql.external;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class User implements Serializable {
    private int id;
    private int userId;
    private String name;
}

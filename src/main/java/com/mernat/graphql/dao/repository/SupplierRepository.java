package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

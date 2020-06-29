package com.mernat.graphql.dao.repository.procurement;

import com.mernat.graphql.dao.entity.procurement.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

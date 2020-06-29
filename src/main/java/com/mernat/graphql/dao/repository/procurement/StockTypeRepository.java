package com.mernat.graphql.dao.repository.procurement;

import com.mernat.graphql.dao.entity.procurement.StockType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTypeRepository extends JpaRepository<StockType, Integer> {
}

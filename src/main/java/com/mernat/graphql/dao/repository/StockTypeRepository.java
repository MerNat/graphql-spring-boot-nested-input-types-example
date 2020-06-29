package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.StockType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTypeRepository extends JpaRepository<StockType, Integer> {
}

package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}

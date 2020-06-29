package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.StockCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockCatRepository extends JpaRepository<StockCategory, Integer> {
}

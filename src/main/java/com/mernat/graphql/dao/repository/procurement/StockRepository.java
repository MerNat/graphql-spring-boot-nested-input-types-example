package com.mernat.graphql.dao.repository.procurement;

import com.mernat.graphql.dao.entity.procurement.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}

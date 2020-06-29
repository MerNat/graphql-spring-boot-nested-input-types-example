package com.mernat.graphql.dao.repository.procurement;

import com.mernat.graphql.dao.entity.procurement.StockCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockCatRepository extends JpaRepository<StockCategory, Integer> {
}

package com.mernat.graphql.dao.repository.procurement;

import com.mernat.graphql.dao.entity.procurement.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

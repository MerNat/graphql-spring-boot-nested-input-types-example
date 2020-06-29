package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

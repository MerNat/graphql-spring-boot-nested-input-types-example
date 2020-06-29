package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.VAT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VATRepository extends JpaRepository<VAT, Integer> {
}

package com.mernat.graphql.dao.repository;

import com.mernat.graphql.dao.entity.Bio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BioRepository extends JpaRepository<Bio, Integer> {

}

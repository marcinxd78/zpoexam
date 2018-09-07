package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.AdditionalCost;

@Repository
public interface AdditionalCostRepository extends JpaRepository<AdditionalCost, Integer> {
}

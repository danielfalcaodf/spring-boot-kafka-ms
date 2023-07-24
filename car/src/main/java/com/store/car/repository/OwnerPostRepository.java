package com.store.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.car.entity.OwnerPostEntity;

public interface OwnerPostRepository extends JpaRepository<OwnerPostEntity, Long> {

}
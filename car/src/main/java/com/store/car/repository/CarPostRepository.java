package com.store.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.car.entity.CarPostEntity;

public interface CarPostRepository extends JpaRepository<CarPostEntity, Long> {

}
package com.store.car.converter;

import org.springframework.stereotype.Service;

import com.store.car.dto.CarPostDTO;
import com.store.car.entity.CarPostEntity;

@Service
public class CardPostConverter {
    public CarPostDTO toDto(CarPostEntity carPostEntity) {

        return CarPostDTO.builder()
                .brand(carPostEntity.getBrand())
                .city(carPostEntity.getCity())
                .model(carPostEntity.getModel())
                .description(carPostEntity.getDescription())
                .engineVersion(carPostEntity.getEngineVersion())
                .createdDate(carPostEntity.getCreatedDate())
                .ownerName(carPostEntity.getOwnerPost().getName())
                .price(carPostEntity.getPrice()).build();

    }
}

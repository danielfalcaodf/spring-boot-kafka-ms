package com.portal.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portal.api.dto.CarPostDTO;

@Service
public interface CarPostStoreService {
    List<CarPostDTO> getCarForSales();

    void changeCarForSale(CarPostDTO carPost, String id);

    void removeCarForSale(String id);
}

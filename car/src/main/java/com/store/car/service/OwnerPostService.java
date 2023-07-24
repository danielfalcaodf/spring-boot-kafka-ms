package com.store.car.service;

import org.springframework.stereotype.Service;

import com.store.car.dto.OwnerPostDTO;

@Service
public interface OwnerPostService {

    void createOwnerPost(OwnerPostDTO ownerPostDTO);
    // Your service interface code here
}
package com.portal.api.service;

import org.springframework.stereotype.Service;

import com.portal.api.dto.OwnerPostDTO;

@Service
public interface OwnerPostService {

    void createOwnerCar(OwnerPostDTO ownerPostDTO);

}

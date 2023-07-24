package com.store.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.car.dto.OwnerPostDTO;
import com.store.car.service.OwnerPostService;

@RestController
@RequestMapping("/user")
public class OwnerPostController {

    @Autowired
    private OwnerPostService ownerPostService;

    @PostMapping
    public ResponseEntity createOwner(@RequestBody OwnerPostDTO ownerPostDTO) {
        ownerPostService.createOwnerPost(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

package com.portal.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDTO;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {
    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        // TODO Auto-generated method stub
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        // TODO Auto-generated method stub
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        // TODO Auto-generated method stub
        carPostStoreClient.deleteCarForSaleClient(id);
    }

}

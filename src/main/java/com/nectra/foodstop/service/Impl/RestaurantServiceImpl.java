/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.service.Impl;

import com.nectra.foodstop.model.Restaurant;
import com.nectra.foodstop.repository.RestaurantRepository;
import com.nectra.foodstop.service.RestaurantService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sharath
 */
@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService{

    @Resource
    private RestaurantRepository restaurantRepository; 
    
    @Override
    
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.getRestaurants();
    }

    @Override
    public List<Restaurant> getRestaurantsByName(String name) {
        return restaurantRepository.getRestaurantsByName(name);
    }

    @Override
    @Transactional
    public Restaurant getRestaurantById(String id) {
        return restaurantRepository.getRestaurantById(id);
    }

    @Override
    @Transactional
    public List<Restaurant> getRestaurantsByZipcode(String zipcode) {
        return restaurantRepository.getRestaurantsByZipcode(zipcode);
    }

    @Override
    @Transactional
    public List<Restaurant> getRestaurantsByCity(String city) {
        return restaurantRepository.getRestaurantsByCity(city);
    }

    @Override
    @Transactional
    public List<Restaurant> getRestaurantsByitem(String item) {
        return restaurantRepository.getRestaurantsByitem(item);
    }
    
}
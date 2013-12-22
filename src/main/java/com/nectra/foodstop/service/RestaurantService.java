/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.service;

import com.nectra.foodstop.model.Restaurant;
import java.util.List;

/**
 *
 * @author Sharath
 */
public interface RestaurantService {
    public List<Restaurant> getRestaurants();
    public List<Restaurant> getRestaurantsByName(String name);
    public Restaurant getRestaurantById(String id);
    public List<Restaurant> getRestaurantsByZipcode(String zipcode);
    public List<Restaurant> getRestaurantsByCity(String city);
    public List<Restaurant> getRestaurantsByitem(String item);
}

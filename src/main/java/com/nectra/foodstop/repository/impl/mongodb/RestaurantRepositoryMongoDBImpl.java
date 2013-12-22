/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.repository.impl.mongodb;

import com.nectra.foodstop.model.Address;
import com.nectra.foodstop.model.Restaurant;
import com.nectra.foodstop.repository.MongoRepository;
import com.nectra.foodstop.repository.RestaurantRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Sort;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sharath
 */
@Repository
public class RestaurantRepositoryMongoDBImpl {

    public List<Restaurant> getRestaurants() {
        MongoRepository mongoRepository = new MongoRepositoryImpl();
        MongoOperations mongoOperation = mongoRepository.getMongoOperations();
        List<Restaurant> restaurants = mongoOperation.findAll(Restaurant.class);
        return restaurants;
    }

    public List<Restaurant> getRestaurantsByName(String name) {
        MongoRepository mongoRepository = new MongoRepositoryImpl();
        MongoOperations mongoOperation = mongoRepository.getMongoOperations();

        Query searchRestayrantsByName = new Query(Criteria.where("name").is(name));
        List<Restaurant> restaurants = mongoOperation.find(searchRestayrantsByName, Restaurant.class );
        
        return restaurants;
    }

    public Restaurant getRestaurantById(String id) {
        MongoRepository mongoRepository = new MongoRepositoryImpl();
        MongoOperations mongoOperation = mongoRepository.getMongoOperations();

        Query searchRestayrantsByName = new Query(Criteria.where("_id").is(id));
        Restaurant restaurant = mongoOperation.findOne(searchRestayrantsByName, Restaurant.class );

        return restaurant;
        }

    public List<Restaurant> getRestaurantsByZipcode(String zipcode) {
        MongoRepository mongoRepository = new MongoRepositoryImpl();
        MongoOperations mongoOperation = mongoRepository.getMongoOperations();

        Query searchRestayrantsByName = new Query(Criteria.where("zipcode").is(zipcode));
        List<Address> addresses = mongoOperation.find(searchRestayrantsByName, Address.class );
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        Restaurant restuarant = null;
        for(Address address : addresses)
        {
            restuarant = new Restaurant();
            //address.
            restaurants.add(null);
        }
        return restaurants;
    }

    public List<Restaurant> getRestaurantsByCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Restaurant> getRestaurantsByitem(String item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

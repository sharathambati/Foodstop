/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.controller;

import com.nectra.foodstop.model.Restaurant;
import com.nectra.foodstop.service.RestaurantService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sharath
 */
@Controller
@RequestMapping(value="/restaurant")
public class RestaurantController {
 
    @Autowired
    private RestaurantService restaurantService; 
    
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView restaurantList()
    {
        ModelAndView mav = new ModelAndView("list-of-restaurants");
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        mav.addObject("restaurants", restaurants);
        return mav;
    }
    
    @RequestMapping(value="/name/{name}", method=RequestMethod.GET)
    public ModelAndView restaurantListByName(@PathVariable String name)
    {
        ModelAndView mav = new ModelAndView("list-of-restaurants");
        List<Restaurant> restaurants = restaurantService.getRestaurantsByName(name);
        mav.addObject("restaurants", restaurants);
        return mav;
    }
    public ModelAndView restaurantsByCity(String cityName)
    {
        ModelAndView mav = new ModelAndView();
        List<Restaurant> restaurants = restaurantService.getRestaurantsByCity(cityName);
        mav.addObject("restaurants", restaurants);
        return mav;
    }

    public ModelAndView restaurantsByZip(String zipCode)
    {
        ModelAndView mav = new ModelAndView();
        List<Restaurant> restaurants = restaurantService.getRestaurantsByZipcode(zipCode);
        mav.addObject("restaurants", restaurants);
        return mav;
    }
    
    public ModelAndView restaurantsByItem(String item)
    {
        ModelAndView mav = new ModelAndView();
        List<Restaurant> restaurants = restaurantService.getRestaurantsByitem(item);
        mav.addObject("restaurants", restaurants);
        return mav;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ModelAndView restaurantById(@PathVariable String id)
    {
        ModelAndView mav = new ModelAndView("list-of-restaurants");
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants.add(restaurant);
        mav.addObject("restaurants", restaurants);
        return mav;
    }    
    
}

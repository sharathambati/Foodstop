/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nectra.foodstop.repository.impl.mysql;

import com.nectra.foodstop.model.Restaurant;
import com.nectra.foodstop.repository.RestaurantRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sharath
 */
@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Restaurant> getRestaurants() {
        Session session = getCurrentSession();
        List<Restaurant> restaurants = session.createQuery("from Restaurant").list();
        return restaurants;
    }

    @Override
    public List<Restaurant> getRestaurantsByName(String name) {
        Criteria criteria = getCurrentSession().createCriteria(Restaurant.class);
        criteria.add(Restrictions.like("name", "%"+name+"%"));
        return criteria.list();
    }

    @Override
    public Restaurant getRestaurantById(String id) {
          Session session = getCurrentSession();
          Restaurant restaurant = (Restaurant) session.get(Restaurant.class, id);
          return restaurant;
    }

    @Override
    public List<Restaurant> getRestaurantsByZipcode(String zipcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Restaurant> getRestaurantsByCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Restaurant> getRestaurantsByitem(String item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sharath
 */
@Repository
public interface MongoRepository {
    public ApplicationContext getApplicationContext();
    public MongoOperations getMongoOperations();
}

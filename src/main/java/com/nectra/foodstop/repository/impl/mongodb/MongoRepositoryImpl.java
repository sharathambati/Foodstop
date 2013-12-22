/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.repository.impl.mongodb;

import com.nectra.foodstop.config.SpringMongoConfig;
import com.nectra.foodstop.repository.MongoRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sharath
 */
@Repository
public class MongoRepositoryImpl implements MongoRepository{
    public ApplicationContext getApplicationContext(){
       return new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    }
    
    public MongoOperations getMongoOperations(){
     return (MongoOperations) getApplicationContext().getBean("mongoTemplate");   
    }
}

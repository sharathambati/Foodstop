package com.nectra.foodstop.core;

import com.nectra.foodstop.config.SpringMongoConfig;
import com.nectra.foodstop.model.Restaurant;
import com.nectra.foodstop.model.Software;
import com.nectra.foodstop.repository.RestaurantRepository;
import com.nectra.foodstop.repository.impl.mongodb.RestaurantRepositoryMongoDBImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // For Annotation
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        
        RestaurantRepositoryMongoDBImpl restaurantRepository = new RestaurantRepositoryMongoDBImpl();
        List<Restaurant> restaurants = restaurantRepository.getRestaurants();
        for(Restaurant restaurant : restaurants)
        {
            System.out.println(restaurant.toString());  
        }
        
        Restaurant restaurant = restaurantRepository.getRestaurantById("001");
        System.out.println(restaurant.toString());  

        restaurants = restaurantRepository.getRestaurantsByZipcode("28277");
        for(Restaurant restaurant1 : restaurants)
        {
            System.out.println(restaurant1.toString());  
        }
        
       /* MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        Software software = new Software();
        software.setId("Cassundra");
        software.setParent("Databases");
        
        //Save
        mongoOperation.save(software);
        
        System.out.println("Software:"+software);
        
        //query to search databases
        Query searchDatabaseQuery = new Query(Criteria.where("_id").is("Cassundra"));
        
        software = mongoOperation.findOne(searchDatabaseQuery, Software.class);
        System.out.println("Query Software"+software);
        
        //update database
        mongoOperation.updateFirst(searchDatabaseQuery, Update.update("parent", "Databases"), Software.class);

        //query to search databases
        searchDatabaseQuery = new Query(Criteria.where("_id").is("Cassundra"));
        System.out.println("Software:"+software);
        
        //remove
        mongoOperation.remove(searchDatabaseQuery, Software.class);
        
        //List
        List<Software> softwares = mongoOperation.findAll(Software.class);
        System.out.println("no of softwares:"+softwares.size());
        */
    }
}

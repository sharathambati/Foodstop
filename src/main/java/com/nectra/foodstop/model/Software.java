/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nectra.foodstop.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Sharath
 */
@Document(collection = "software")
public class Software {

    @Id
    private String id;
    private String parent;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Software{" + "id=" + id + ", parent=" + parent + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 47 * hash + (this.parent != null ? this.parent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return new EqualsBuilder().equals(obj);
    }



}

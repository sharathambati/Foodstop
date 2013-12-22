/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Sharath
 */


@Document(collection = "address")
public class Address {
    @Id
    private String _id;
    private String name;
    @DBRef
    private Restaurant restaurant;
    private String restaurantId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String countryCode;
    private String phone1;
    private String phone2;
    private String fax;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Address{" + "_id=" + _id + ", name=" + name + ", restaurantId=" + restaurantId + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", countryCode=" + countryCode + ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax=" + fax + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this._id != null ? this._id.hashCode() : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.restaurantId != null ? this.restaurantId.hashCode() : 0);
        hash = 97 * hash + (this.address1 != null ? this.address1.hashCode() : 0);
        hash = 97 * hash + (this.address2 != null ? this.address2.hashCode() : 0);
        hash = 97 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 97 * hash + (this.state != null ? this.state.hashCode() : 0);
        hash = 97 * hash + (this.zipcode != null ? this.zipcode.hashCode() : 0);
        hash = 97 * hash + (this.countryCode != null ? this.countryCode.hashCode() : 0);
        hash = 97 * hash + (this.phone1 != null ? this.phone1.hashCode() : 0);
        hash = 97 * hash + (this.phone2 != null ? this.phone2.hashCode() : 0);
        hash = 97 * hash + (this.fax != null ? this.fax.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return new EqualsBuilder().isEquals();
    }
    
    
}

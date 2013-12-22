/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nectra.foodstop.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Sharath
 */
@Document(collection = "hours")
public class Hours {

    @Id
    private String _id;
    private String fromDay;
    private String toDay;
    private String fromTime;
    private String toTime;
    private String restaurantId;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getFromDay() {
        return fromDay;
    }

    public void setFromDay(String fromDay) {
        this.fromDay = fromDay;
    }

    public String getToDay() {
        return toDay;
    }

    public void setToDay(String toDay) {
        this.toDay = toDay;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        return "Hours{" + "_id=" + _id + ", fromDay=" + fromDay + ", toDay=" + toDay + ", fromTime=" + fromTime + ", toTime=" + toTime + ", restaurantId=" + restaurantId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this._id != null ? this._id.hashCode() : 0);
        hash = 83 * hash + (this.fromDay != null ? this.fromDay.hashCode() : 0);
        hash = 83 * hash + (this.toDay != null ? this.toDay.hashCode() : 0);
        hash = 83 * hash + (this.fromTime != null ? this.fromTime.hashCode() : 0);
        hash = 83 * hash + (this.toTime != null ? this.toTime.hashCode() : 0);
        hash = 83 * hash + (this.restaurantId != null ? this.restaurantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return new EqualsBuilder().isEquals();
    }

}

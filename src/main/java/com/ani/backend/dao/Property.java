package com.ani.backend.dao;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "property_price")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="property_id")
    private long propertyId;

    @Column(name = "property_price")
    private double propertyPrice;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "new_Price")
    private double newPrice;


    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }


    public double getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(double propertyPrice) {
        this.propertyPrice = propertyPrice;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}

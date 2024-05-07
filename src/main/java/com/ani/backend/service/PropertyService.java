package com.ani.backend.service;

import com.ani.backend.dao.Property;
import com.ani.backend.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    public void updatePropertyPrice(Long propertyId, double newPrice) {
        Property property = propertyRepository.findById(propertyId)
                .orElseThrow(() -> new NoSuchElementException("Property not found"));

        property.setNewPrice(newPrice);
        propertyRepository.save(property);
    }
}

package com.ani.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.backend.dao.Property;
import com.ani.backend.repositories.PropertyRepository;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    public Property updatePropertyPrice(Long id, double newPrice) {
        Property property = propertyRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Property not found"));
        
        property.setPrice(newPrice);
        return propertyRepository.save(property);
    }
}

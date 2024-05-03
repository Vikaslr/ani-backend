package com.ani.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ani.backend.dao.Property;
import com.ani.backend.service.PropertyService;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @PutMapping("/{property_id}/price")
    public Property updatePropertyPrice(@PathVariable Long property_id, @RequestParam double new_Price) {
        return propertyService.updatePropertyPrice(property_id, new_Price);
    }
}


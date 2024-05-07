package com.ani.backend.controllers;// PropertyController.java

import com.ani.backend.dao.Property;
import com.ani.backend.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @PutMapping("/{propertyId}/price")
    public ResponseEntity<String> updatePropertyPrice(@PathVariable("propertyId") Long propertyId, @RequestParam("newPrice") double newPrice) {
        propertyService.updatePropertyPrice(propertyId, newPrice);
        return ResponseEntity.ok("Property price updated successfully");
    }
}

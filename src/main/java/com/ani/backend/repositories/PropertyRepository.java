package com.ani.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ani.backend.dao.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}

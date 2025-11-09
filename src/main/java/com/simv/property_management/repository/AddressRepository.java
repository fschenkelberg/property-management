package com.simv.property_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simv.property_management.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}

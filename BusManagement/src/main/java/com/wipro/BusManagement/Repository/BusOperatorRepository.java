package com.wipro.BusManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.BusManagement.Entity.Bus;

public interface BusOperatorRepository extends JpaRepository<Bus, Long>{

}

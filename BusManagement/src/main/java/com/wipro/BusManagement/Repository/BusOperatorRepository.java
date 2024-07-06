package com.wipro.BusManagement.Repository;

import com.wipro.BusManagement.Entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusOperatorRepository extends JpaRepository<Bus, Long> {

}

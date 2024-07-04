package com.wipro.BusManagement.Repository;

import com.wipro.BusManagement.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

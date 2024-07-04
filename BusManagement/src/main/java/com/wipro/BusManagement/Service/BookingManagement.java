package com.wipro.BusManagement.Service;

import com.wipro.BusManagement.Entity.Booking;
import com.wipro.BusManagement.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingManagement {
    
    @Autowired
    BookingRepository bookingRepository;
    public List<Booking> getBookingHistory(){
        //
        return bookingRepository.findAll();
    }
}

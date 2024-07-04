package com.wipro.BusManagement.Controller;

import com.wipro.BusManagement.Entity.Booking;
import com.wipro.BusManagement.Service.BookingManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingManagementController {

    @Autowired
    BookingManagement bookingManagement;

    @GetMapping("/bookinghistory")
    public List<Booking> getBookingHistory(String userid){
        return this.bookingManagement.getBookingHistory();
    }
}

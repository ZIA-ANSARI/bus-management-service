package com.wipro.BusManagement.Controller;

import com.wipro.BusManagement.Entity.Booking;
import com.wipro.BusManagement.Entity.User;
import com.wipro.BusManagement.Model.BookingDetails;
import com.wipro.BusManagement.Service.BookingManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/users")
    public List<User> getUsers(String userid){
        return this.bookingManagement.getUsers();
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
//    User u = new User("password", "name", false, false, true, 100d);
    bookingManagement.addUser(user);
    }

//    @PostMapping("/user")
//    public void bookTicket(@RequestBody Booking bkdetails){
////    User u = new User("password", "name", false, false, true, 100d);
//        bookingManagement.bookTicket(bkdetails);
//    }
}

package com.wipro.BusManagement.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BookingDetails {

    private UserDetail user;
    private Date dateTime;

    private Long BookingId;
    private String name;

    private Integer age;
    public UserDetail getUser() {
        return user;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Long getBookingId() {
        return BookingId;
    }

    public void setBookingId(Long bookingId) {
        BookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

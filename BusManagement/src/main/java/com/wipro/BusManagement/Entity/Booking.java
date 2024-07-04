package com.wipro.BusManagement.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "busId", nullable = false)
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    private Integer seatNo;

    private LocalDateTime dateTime; // Consider using LocalDateTime for date and time

    private LocalDate dateOfBooking; // Use LocalDate for booking date

    private Integer age;

    private String name;
    
    public Booking() {
    	
    }

	public Booking(Long bookingId, Bus bus, User user, Integer seatNo, LocalDateTime dateTime, LocalDate dateOfBooking,
			Integer age, String name) {
		super();
		this.bookingId = bookingId;
		this.bus = bus;
		this.user = user;
		this.seatNo = seatNo;
		this.dateTime = dateTime;
		this.dateOfBooking = dateOfBooking;
		this.age = age;
		this.name = name;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

}

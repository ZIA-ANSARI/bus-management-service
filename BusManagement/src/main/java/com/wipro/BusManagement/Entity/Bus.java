package com.wipro.BusManagement.Entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    @ManyToOne
    @JoinColumn(name = "routeId", nullable = false)
    private Route route;

    private String date;

    private String busNo;

    private Integer seatAvailability;

    private String busName;

    private Double seatPrice;
    
    private LocalTime arrivalTime; // Use LocalTime for arrival time

    private LocalTime departureTime; // Use LocalTime for departure
    
    public Bus() {
    	
    }

	public Bus(Long busId, Route route, String date, String busNo, Integer seatAvailability, String busName,
			Double seatPrice, LocalTime arrivalTime, LocalTime departureTime) {
		super();
		this.busId = busId;
		this.route = route;
		this.date = date;
		this.busNo = busNo;
		this.seatAvailability = seatAvailability;
		this.busName = busName;
		this.seatPrice = seatPrice;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public Integer getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(Integer seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	 
    

}

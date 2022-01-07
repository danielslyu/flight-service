package com.flight.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repostory.JpaRepository;

import com.flight.demo.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	List<Flight >searchFlights(String date, String time, String origin, String destination, String flightType);
}

package com.flight.demo.service;

import java.util.List;

import com.flight.demo.entity.Flight;

public interface FlightService {
	List<Flight> searchFlights(String date, String time, String origin,
			String destination, String flightType);
}

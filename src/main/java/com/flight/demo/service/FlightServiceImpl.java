package com.flight.demo.service;

import java.util.List;

import com.flight.demo.entity.Flight;
import com.flight.demo.repository.FlightRepository;

public class FlightServiceImpl implements FlightService {
	
	FlightRepository repository;

	@Override
	public List<Flight> searchFlights(String date, String time, String origin, String destination, String flightType) {
		return repository.searchFlights(date, time, origin, destination, flightType);
	}

}

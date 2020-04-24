package com.capg.fms.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.entity.Airport;
import com.capg.fms.entity.Flight;
import com.capg.fms.entity.Schedule;
import com.capg.fms.entity.ScheduledFlight;
import com.capg.fms.service.FlightServiceImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FlightRestController {

	@Autowired
	FlightServiceImpl fsi;
	
	@PostMapping
	public String scheduleFlight(ScheduledFlight scheduledflight) {
		return null;
	}
	
	@GetMapping
	public List<ScheduledFlight> viewscheduledFlights(Airport sourceAirport, Airport destinationAirport,LocalDate date) {
		return null;
	} 
	
	@GetMapping
	public String viewScheduledFlights(int flightNumber) {
		return null;
	}
	
	@GetMapping
	public List<ScheduledFlight> viewscheduledFlight() {
		return null;
	}
	
	@PostMapping
	public String modifyScheduledFlight(Flight flight, Schedule schedule, int capacity) {
		return null;
	}
	
	@DeleteMapping
	public void deleteScheduledFlight(int flightnumber) {
	}
}

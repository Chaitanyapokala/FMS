package com.capg.fms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fms.dao.IFlightDao;
import com.capg.fms.entity.Airport;
import com.capg.fms.entity.Flight;
import com.capg.fms.entity.Schedule;
import com.capg.fms.entity.ScheduledFlight;

@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	IFlightDao dao;

	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledflight) {
		// TODO Auto-generated method stub
		return dao.scheduleFlight(scheduledflight);
	}

	@Override
	public List<ScheduledFlight> viewscheduledFlights(Airport sourceAirport, Airport destinationAirport,
			LocalDate date) {
		// TODO Auto-generated method stub
		return dao.viewscheduledFlights(sourceAirport, destinationAirport, date);
	}

	@Override
	public Flight viewScheduledFlights(int flightNumber) {
		// TODO Auto-generated method stub
		return dao.viewScheduledFlights(flightNumber);
	}

	@Override
	public List<ScheduledFlight> viewscheduledFlight() {
		// TODO Auto-generated method stub
		return dao.viewscheduledFlight();
	}

	@Override
	public void deleteScheduledFlight(int flightnumber) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int capacity) {
		// TODO Auto-generated method stub
		return dao.modifyScheduledFlight(flight, schedule, capacity);
	}

}

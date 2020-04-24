package com.capg.fms.dao;

import java.time.LocalDate;
import java.util.List;

import com.capg.fms.entity.Airport;
import com.capg.fms.entity.Flight;
import com.capg.fms.entity.Schedule;
import com.capg.fms.entity.ScheduledFlight;

public class FlightDaoImpl implements IFlightDao {

	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledflight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> viewscheduledFlights(Airport sourceAirport, Airport destinationAirport,
			LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight viewScheduledFlights(int flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> viewscheduledFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScheduledFlight(int flightnumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int capacity) {
		// TODO Auto-generated method stub
		return null;
	}

}

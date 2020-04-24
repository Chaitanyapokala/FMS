package com.capg.fms.dao;

import java.time.LocalDate;
import java.util.List;

import com.capg.fms.entity.Airport;
import com.capg.fms.entity.Flight;
import com.capg.fms.entity.Schedule;
import com.capg.fms.entity.ScheduledFlight;

public interface IFlightDao {
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledflight);

	public List<ScheduledFlight> viewscheduledFlights(Airport sourceAirport, Airport destinationAirport,LocalDate date);

	public Flight viewScheduledFlights(int flightNumber);

	public List<ScheduledFlight> viewscheduledFlight();

	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int capacity);

	public void deleteScheduledFlight(int flightnumber);
}

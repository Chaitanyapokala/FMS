package com.capg.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class ScheduledFlight {

	private Flight flight;
	private int availableseats;
	private Schedule schedule;

	public ScheduledFlight(Flight flight, int availableseats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableseats = availableseats;
		this.schedule = schedule;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "ScheduledFlight [flight=" + flight + ", availableseats=" + availableseats + ", schedule=" + schedule
				+ "]";
	}
}

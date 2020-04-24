package com.capg.fms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Schedule {

	private Airport sourceAirport;
	private Airport destinationAirport;
	private LocalDate arrivalTime;
	private LocalDate departureTime;

	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDate arrivalTime, LocalDate departureTime) {
		super();
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Schedule [arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}

}

package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Seatstatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Showseat  {
	
	@Id
	private long id;
	@ManyToOne
	private Show show;
	@ManyToOne
	private seat seat;
	@ManyToOne
	private Ticket ticket;
	
	@Enumerated(EnumType.ORDINAL)
	private Seatstatus seatstatus;
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public seat getSeat() {
		return seat;
	}
	public void setSeat(seat seat) {
		this.seat = seat;
	}
	public Seatstatus getSeatstatus() {
		return seatstatus;
	}
	public void setSeatstatus(Seatstatus seatstatus) {
		this.seatstatus = seatstatus;
	}
	
	
	

}

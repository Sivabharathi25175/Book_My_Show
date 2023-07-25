package com.example.demo.siva.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Ticket {
	@Id
	private long id;
	private Date bookedat;
	@ManyToMany
	private List< User> bookedby;
	private int amount;
	@OneToMany(mappedBy="ticket")
	private List<Showseat> showseat;
	@OneToOne
	private Payment payment;
	
	
	
	
	

}

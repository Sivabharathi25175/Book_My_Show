package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Seattype;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Showseattype {
	
	@Id
	private long id;
	@ManyToOne
	private Show show;
	@Enumerated(EnumType.ORDINAL)
	private Seattype seattype;
	private int price;
	

	
	
}

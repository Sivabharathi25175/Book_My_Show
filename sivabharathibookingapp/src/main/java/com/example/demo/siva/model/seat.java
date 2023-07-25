package com.example.demo.siva.model;

import java.util.List;

import com.example.demo.siva.Enum.Seattype;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "`Seat`")
public class seat {
	@Id
	private long id;
	private String number;
	
	private int se_row;
	private int Se_col;
	@OneToOne
//	(mappedBy="seat")
	private Showseat shwoseat;
	
	@ManyToOne(cascade=CascadeType.ALL)
//			@JoinColumn(name="seat_id")
	private Audi audi;
	
	
	

	@Enumerated(EnumType.ORDINAL)
	private Seattype seattype;
	
	
	

}

package com.example.demo.siva.model;


import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.siva.Enum.Feature;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name="showtime")
public class Show {
	@Id
	private long show_id;
	@DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
	private  Date starttime;
	@DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
	private Date endtime;
	@ManyToOne
	private Movie movie;
	@ManyToOne
	private Audi audii;
	@OneToMany(mappedBy="show")
	private  List<Showseat> showseat;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> featurerequired;
	
	
	
	
	
	
	
	

}

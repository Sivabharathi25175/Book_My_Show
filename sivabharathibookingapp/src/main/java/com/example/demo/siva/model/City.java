package com.example.demo.siva.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Entity
@ToString
public class City  {
	
	@Id
	private long cid;
	
	private String name;
	@OneToMany(mappedBy="city")
	private List<Theater> Theaters;
	
	

}

package com.example.demo.siva.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Theater  {
	
	@Id
	private long id;
	private String name;
	private String address;
	@OneToMany(mappedBy="theater")
	private List<Audi> aduti;
	@ManyToOne
	private City city;
	public String getName() {
		return name;
	}
	
	
	

}

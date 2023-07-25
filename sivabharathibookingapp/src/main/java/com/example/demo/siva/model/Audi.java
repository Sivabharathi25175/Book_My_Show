package com.example.demo.siva.model;

import java.util.List;



import com.example.demo.siva.Enum.Feature;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Entity
@ToString
public class Audi {
	@Id
	private long id;
	
	@ManyToOne
	private Theater theater;
	
	
	private String name;
	@OneToMany
	(mappedBy="audi",cascade=CascadeType.ALL)
	private List<seat> seats;
	@OneToMany
	private List<Show> shows;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> featurssupported;

	
	
	

}

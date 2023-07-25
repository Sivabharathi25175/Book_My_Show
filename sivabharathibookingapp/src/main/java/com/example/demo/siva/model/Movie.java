package com.example.demo.siva.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.example.demo.siva.Enum.Language;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Movie {
	@Id
	private long id;
	private String name;
	private String Describtion;
	private Language language;
    @OneToMany(mappedBy="movie")
//	@ElementCollection
	private List<Show> show;
	
	
	
//	m actor
//	1  m
//	m  1
//	m m
	

}

package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Role;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Setter
@Getter

public class User  {
	@Id
	private long id;
	
	private String User_name;
	
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	
	
	

}

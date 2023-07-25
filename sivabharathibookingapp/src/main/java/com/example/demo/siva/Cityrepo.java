package com.example.demo.siva;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.siva.model.City;
import java.util.List;
import com.example.demo.siva.model.Theater;



@Repository
public interface Cityrepo extends JpaRepository<City, Long> {


	
   City findByName(String name);

City findByCid(long cid);





	


}

package com.example.demo.siva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.siva.model.City;
import com.example.demo.siva.model.Theater;

@RestController
public class citycon {
	
	@Autowired Cityrepo crepo;
	
	@PostMapping("/save")
	public ResponseEntity<City> getEmployeeById(@RequestBody City c) {
			    crepo.save(c);
			    return ResponseEntity.ok().body(c);
			}
	@GetMapping("/get")
	public List<City> d(){
//		long n=1;
//		City c=crepo.findUserByStatus("dindigul");
//		return c;
		return crepo.findAll();
		
	}
	
	@GetMapping("/gett")
	public City de(){
		
//		return crepo.findByName(str);
		return crepo.findByCid(1);
		
	}
	@Autowired
	Thatrerrepo r;
	@GetMapping("/g")
	public List<Theater> dee(){
		
//	
		return r.findAll();
	}
	
}

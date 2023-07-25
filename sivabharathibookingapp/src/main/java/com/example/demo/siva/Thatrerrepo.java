package com.example.demo.siva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.siva.model.Theater;

@Repository
public interface Thatrerrepo extends JpaRepository<Theater,Long> {

}

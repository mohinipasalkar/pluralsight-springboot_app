package com.pluralsight.conferencedemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.Sessio;

public interface SessionRepository extends JpaRepository<Sessio, Long>{

	
 
}

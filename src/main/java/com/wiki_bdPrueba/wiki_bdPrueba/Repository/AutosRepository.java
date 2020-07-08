package com.wiki_bdPrueba.wiki_bdPrueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiki_bdPrueba.wiki_bdPrueba.Entity.Autos;



@Repository
public interface AutosRepository extends JpaRepository<Autos, Long> {
	
	
}
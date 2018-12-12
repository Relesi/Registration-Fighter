package com.relesi.fighterregistration.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relesi.fighterregistration.api.entities.Fighter;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {

}

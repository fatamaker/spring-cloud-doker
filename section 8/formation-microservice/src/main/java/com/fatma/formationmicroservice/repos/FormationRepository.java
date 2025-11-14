package com.fatma.formationmicroservice.repos;

import com.fatma.formationmicroservice.entites.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}

package com.codesa.backend.repository;

import com.codesa.backend.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Optional<Persona> findByEmail(String email);
    boolean existsByEmail(String email);
}

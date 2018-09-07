package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Spectacle;
//dajemy informacje że mamy doczynienia z repozytorium zarządzanym przes spring Data i dodajemy go z adnotacja do kontrolera 
//jest to klasa odpowiadająca za dostep do danych
@Repository
public interface SpectacleRepository extends JpaRepository<Spectacle, Integer> {
}

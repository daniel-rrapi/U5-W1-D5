package com.danielrrapi.U5W1D5.DAO;

import com.danielrrapi.U5W1D5.entities.Workstation;
import com.danielrrapi.U5W1D5.enums.WorkstationTypes;
import jakarta.persistence.Enumerated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkstationDAO extends JpaRepository<Workstation, Long> {
@Query("SELECT w, b FROM Workstation w, Building b WHERE w.type = :type AND b.city = :city")
    List<Workstation> filterByTypeAndCity(WorkstationTypes type, String city);
}

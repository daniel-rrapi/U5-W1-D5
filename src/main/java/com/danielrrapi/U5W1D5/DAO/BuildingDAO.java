package com.danielrrapi.U5W1D5.DAO;

import com.danielrrapi.U5W1D5.entities.Building;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingDAO extends JpaRepository<Building, Long> {

}

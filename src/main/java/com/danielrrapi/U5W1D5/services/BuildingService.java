package com.danielrrapi.U5W1D5.services;

import com.danielrrapi.U5W1D5.DAO.BuildingDAO;
import com.danielrrapi.U5W1D5.entities.Building;
import com.danielrrapi.U5W1D5.entities.User;
import com.danielrrapi.U5W1D5.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BuildingService {
    @Autowired
    private BuildingDAO buildingDAO;

    public void saveBuilding(Building building) {
        buildingDAO.save(building);
    }

    public Building findById(long id) throws ItemNotFoundException {
        return buildingDAO.findById(id).orElseThrow(() ->  new ItemNotFoundException(id));
    }

    public List<Building> findAll() { return buildingDAO.findAll(); }

    public void findByIdAndDelete(long id) {
        Building found = this.findById(id);
        buildingDAO.delete(found);
    }
}

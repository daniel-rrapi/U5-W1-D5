package com.danielrrapi.U5W1D5.services;

import com.danielrrapi.U5W1D5.DAO.WorkstationDAO;
import com.danielrrapi.U5W1D5.entities.Building;
import com.danielrrapi.U5W1D5.entities.Workstation;
import com.danielrrapi.U5W1D5.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WorkstationService {
    @Autowired
    private WorkstationDAO workstationDAO;
    public void saveWorkstation(Workstation workstation) {
        workstationDAO.save(workstation);
    }

    public Workstation findById(long id) throws ItemNotFoundException {
        return workstationDAO.findById(id).orElseThrow(() ->  new ItemNotFoundException(id));
    }

    public List<Workstation> findAll() { return workstationDAO.findAll(); }

    public void findByIdAndDelete(long id) {
        Workstation found = this.findById(id);
        workstationDAO.delete(found);
    }
}

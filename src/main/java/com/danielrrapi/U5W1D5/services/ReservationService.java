package com.danielrrapi.U5W1D5.services;

import com.danielrrapi.U5W1D5.DAO.ReservationDAO;
import com.danielrrapi.U5W1D5.entities.Reservation;
import com.danielrrapi.U5W1D5.entities.Workstation;
import com.danielrrapi.U5W1D5.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReservationService {
    @Autowired
    private ReservationDAO reservationDAO;
    public void saveReservation(Reservation reservation) {
        reservationDAO.save(reservation);
    }

    public Reservation findById(long id) throws ItemNotFoundException {
        return reservationDAO.findById(id).orElseThrow(() ->  new ItemNotFoundException(id));
    }

    public List<Reservation> findAll() { return reservationDAO.findAll(); }

    public void findByIdAndDelete(long id) {
        Reservation found = this.findById(id);
        reservationDAO.delete(found);
    }
}

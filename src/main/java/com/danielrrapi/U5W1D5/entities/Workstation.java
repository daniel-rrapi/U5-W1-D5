package com.danielrrapi.U5W1D5.entities;

import com.danielrrapi.U5W1D5.enums.WorkstationTypes;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "workstations")
public class Workstation {
    @Id
    @GeneratedValue
    private long id;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private WorkstationTypes type;
    @Column(name = "max_occupants")
    private int maxOccupants;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;
    @OneToMany(mappedBy = "workstation")
    private List<Reservation> reservations;

    public Workstation() {
    }

    public Workstation(String description, WorkstationTypes type, int maxOccupants, Building building) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.building = building;
    }

    public long getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkstationTypes getType() {
        return type;
    }

    public void setType(WorkstationTypes type) {
        this.type = type;
    }

    public int getMaxOccupants() {
        return maxOccupants;
    }

    public void setMaxOccupants(int maxOccupants) {
        this.maxOccupants = maxOccupants;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}

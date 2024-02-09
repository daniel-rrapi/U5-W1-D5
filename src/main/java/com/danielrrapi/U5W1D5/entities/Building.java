package com.danielrrapi.U5W1D5.entities;

import com.danielrrapi.U5W1D5.entities.Workstation;
import jakarta.persistence.*;

import java.util.List;

@Entity()
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private String city;
    @OneToMany(mappedBy = "building")
    private List<Workstation> workstations;

    public Building() {
    }

    public Building(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Workstation> getWorkstations() {
        return workstations;
    }

    public void setWorkstations(List<Workstation> workstations) {
        this.workstations = workstations;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", workstations=" + workstations +
                '}';
    }
}

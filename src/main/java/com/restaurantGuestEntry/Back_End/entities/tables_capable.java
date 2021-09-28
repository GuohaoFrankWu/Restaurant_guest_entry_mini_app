package com.restaurantGuestEntry.Back_End.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "counters")
public class tables_capable {
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "id") //This is mapping the primary key to the id column in the table.
    private int id;

    @Column(name = "max_capacity")
    private int max_capacity;

    @Column(name = "occupancy")
    private boolean occupancy;

    @Column(name = "assign_guest")
    private int assign_guest;

    public tables_capable(){

    }

    public tables_capable(int max, boolean occupy, int assign_guest){

        this.max_capacity = max;
        this.occupancy = occupy;
        this.assign_guest = assign_guest;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setOccupancy(boolean occupancy) {
        this.occupancy = occupancy;
    }

    public boolean isOccupancy() {
        return occupancy;
    }

    public void setAssign_guest(int assign_guest) {
        this.assign_guest = assign_guest;
    }

    public int getAssign_guest() {
        return assign_guest;
    }

    @Override
    public String toString() {
        return "tables_capable{" +
                "id=" + id +
                ", max_capacity=" + max_capacity +
                ", occupancy=" + occupancy +
                ", assign_guest=" + assign_guest +
                '}';
    }
}

package com.restaurantGuestEntry.Back_End.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "entry_guests")
public class guest_entry {
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "id") //This is mapping the primary key to the id column in the table.
    private int id;

    @Column(name = "name")
    private String Name;

    @Column(name = "head_count")
    private int head_counts;

    @Column(name = "assign_table")
    private int assign_table;

    public guest_entry(){

    }

    public guest_entry(int id, String name, int head_counts, int assign_table){
        this.id = id;
        this.Name = name;
        this.head_counts = head_counts;
        this.assign_table = assign_table;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setHead_counts(int head_counts) {
        this.head_counts = head_counts;
    }

    public int getHead_counts() {
        return head_counts;
    }

    public void setAssign_table(int assign_table) {
        this.assign_table = assign_table;
    }

    public int getAssign_table() {
        return assign_table;
    }

    @Override
    public String toString() {
        return "guest_entry{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", head_counts=" + head_counts +
                ", assign_table=" + assign_table +
                '}';
    }
}

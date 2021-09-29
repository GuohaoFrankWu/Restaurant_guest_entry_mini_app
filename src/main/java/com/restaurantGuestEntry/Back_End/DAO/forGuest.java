package com.restaurantGuestEntry.Back_End.DAO;

import com.restaurantGuestEntry.Back_End.entities.guest_entry;

import java.util.List;

public interface forGuest{
    List<guest_entry> findAll();
    void saveOrUpdate(guest_entry entry_guest);
    Object findById(int theId);
    void deleteById(int theId);
}

package com.restaurantGuestEntry.Back_End.DAO;

import com.restaurantGuestEntry.Back_End.entities.guest_entry;

import java.util.List;

public interface forGuest extends DAO{
    List<guest_entry> findAll();
    void saveOrUpdate(guest_entry entry_guest);
}

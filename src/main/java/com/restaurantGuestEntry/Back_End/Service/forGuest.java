package com.restaurantGuestEntry.Back_End.Service;

import com.restaurantGuestEntry.Back_End.entities.guest_entry;

import java.util.List;

public interface forGuest extends service{
    List<guest_entry> findAll();
    void saveOrUpdate(guest_entry theGuest);
}

package com.restaurantGuestEntry.Back_End.Service;

import com.restaurantGuestEntry.Back_End.DAO.forGuest;
import com.restaurantGuestEntry.Back_End.entities.guest_entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GuestServiceIMPL implements forGuest{

    public final forGuest guestDAO;

    @Autowired
    public GuestServiceIMPL(forGuest guestDAO) {
        this.guestDAO = guestDAO;
    }

    @Override
    public List<guest_entry> findAll() {
        return guestDAO.findAll();
    }

    @Override
    public Object findById(int id) {
        return guestDAO.findById(id);
    }

    @Override
    public void saveOrUpdate(guest_entry theGuest) {
        guestDAO.saveOrUpdate(theGuest);
    }

    @Override
    public void deleteById(int id) {
        guestDAO.deleteById(id);
    }
}

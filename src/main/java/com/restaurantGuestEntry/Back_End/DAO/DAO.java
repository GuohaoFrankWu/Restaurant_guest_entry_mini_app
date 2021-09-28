package com.restaurantGuestEntry.Back_End.DAO;

import com.restaurantGuestEntry.Back_End.entities.*;

import java.util.*;
public interface DAO {

    Object findById(int theId);
    void deleteById(int theId);
}

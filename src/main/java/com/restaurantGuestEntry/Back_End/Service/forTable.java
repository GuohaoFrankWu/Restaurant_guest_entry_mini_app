package com.restaurantGuestEntry.Back_End.Service;

import com.restaurantGuestEntry.Back_End.entities.*;

import java.util.List;

public interface forTable extends service{
    List<tables_capable> findAll();
    void saveOrUpdate(tables_capable theTable);
}

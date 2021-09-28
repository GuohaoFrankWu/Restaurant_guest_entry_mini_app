package com.restaurantGuestEntry.Back_End.DAO;

import com.restaurantGuestEntry.Back_End.entities.tables_capable;

import java.util.List;

public interface forTable extends DAO{
    List<tables_capable> findAll();
    void saveOrUpdate(tables_capable capable);
}

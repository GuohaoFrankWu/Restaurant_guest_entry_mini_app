package com.restaurantGuestEntry.Back_End.Service;

import com.restaurantGuestEntry.Back_End.DAO.forTable;
import com.restaurantGuestEntry.Back_End.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class tableServiceIMPL implements forTable{
    public final forTable tableDAO;

    @Autowired
    public tableServiceIMPL(forTable tableDAO) {
        this.tableDAO = tableDAO;
    }

    @Override
    public List<tables_capable> findAll() {
        return tableDAO.findAll();
    }

    @Override
    public Object findById(int id) {
        return tableDAO.findById(id);
    }

    @Override
    public void saveOrUpdate(tables_capable theTable) {
        tableDAO.saveOrUpdate(theTable);
    }

    @Override
    public void deleteById(int id) {
        tableDAO.deleteById(id);
    }
}

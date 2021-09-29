package com.restaurantGuestEntry.Back_End.Controllers;

import com.restaurantGuestEntry.Back_End.entities.tables_capable;
import com.restaurantGuestEntry.Back_End.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = { "http://localhost:3005"})
@RestController
public class table_Controller {
    private final forTable tableService;

    @Autowired
    public table_Controller(@Qualifier("tableServiceIMPL") forTable tableService) {
        this.tableService = tableService;
    }


    //http://localhost:8080/retrieveAllTables
    @GetMapping("/retrieveAllTables")
    public List<tables_capable> findAll(){
        return tableService.findAll();
    }

    //http://localhost:8080/addTable
    @PostMapping("/addTable")
    public tables_capable addTable(@RequestBody tables_capable theTable) {
        //also just in case they pass an id in JSON .... set id to o
        //this is to force a save of new item .... instead of update
        theTable.setId(0);

        //This will call the employeeDqoImpl.save method to save a new employee
        //through the employeeService interface SPRING
        tableService.saveOrUpdate(theTable);
        return theTable;
    }

    //http://localhost:8080/updateTable
    @PutMapping("/updateTable")
    public tables_capable getUpdateTable(@RequestBody tables_capable updateTable) {
        //No theEmployee.setId(0); this will execute an update instead of a create
        tableService.saveOrUpdate(updateTable);
        return updateTable;
    }

    //This is a DELETE request to delete an existing employee.
    //http://localhost:8080/deleteGuest/1
    @DeleteMapping("/deleteTable/{TableID}")
    public String deleteGuest(@PathVariable int TableID) {
        //This will execute the deleteByID.
        tableService.deleteById(TableID);
        return "Deleted table id : " + TableID;
    }
}

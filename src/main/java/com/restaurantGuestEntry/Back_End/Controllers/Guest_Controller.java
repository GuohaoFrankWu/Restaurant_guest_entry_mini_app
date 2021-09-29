package com.restaurantGuestEntry.Back_End.Controllers;

import com.restaurantGuestEntry.Back_End.entities.guest_entry;
import com.restaurantGuestEntry.Back_End.Service.forGuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = { "http://localhost:3006"})
@RestController
public class Guest_Controller {
    private final forGuest guestService;

    @Autowired
    public Guest_Controller(@Qualifier("GuestServiceIMPL") forGuest guestService) {
        this.guestService = guestService;
    }

    //http://localhost:8080/retrieveAllGuests
    @ResponseBody
    @GetMapping("/retrieveAllGuests")
    public List<guest_entry> findAll(){
        return guestService.findAll();
    }

    //http://localhost:8080/addGuests
    @PostMapping("/addGuests")
    public guest_entry addGuests(@RequestBody guest_entry theGuest) {
        //also just in case they pass an id in JSON .... set id to o
        //this is to force a save of new item .... instead of update
        theGuest.setId(0);

        //This will call the employeeDqoImpl.save method to save a new employee
        //through the employeeService interface SPRING
        guestService.saveOrUpdate(theGuest);
        return theGuest;
    }

    //http://localhost:8080/updateGuest
    @PutMapping("/updateGuest")
    public guest_entry getUpdateGuest(@RequestBody guest_entry updateGuest) {
        //No theEmployee.setId(0); this will execute an update instead of a create
        guestService.saveOrUpdate(updateGuest);
        return updateGuest;
    }

    //This is a DELETE request to delete an existing employee.
    //http://localhost:8080/deleteGuest/1
    @DeleteMapping("/deleteGuest/{GuestID}")
    public String deleteGuest(@PathVariable int GuestID) {
        //This will execute the deleteByID.
        guestService.deleteById(GuestID);
        return "Deleted Guest id : " + GuestID;
    }
}

package com.restaurantGuestEntry.Back_End.DAO;
import com.restaurantGuestEntry.Back_End.entities.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.*;

@Repository
public class guest_entryIMPL implements forGuest{
    public final EntityManager guest_entity;

    @Autowired
    public guest_entryIMPL(EntityManager guest_entity) {
        this.guest_entity = guest_entity;
    }

    @Override
    @Transactional
    public List<guest_entry> findAll() {
        Session currentSession = guest_entity.unwrap(Session.class);
        Query<guest_entry> myQuery = currentSession.createQuery("from entry_guests");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession = guest_entity.unwrap(Session.class);
        return currentSession.get(guest_entry.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(guest_entry entry_guest) {
        Session currentSession = guest_entity.unwrap(Session.class);
        currentSession.saveOrUpdate(entry_guest);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = guest_entity.unwrap(Session.class);
        guest_entry myGuest = currentSession.get(guest_entry.class, theId);
        currentSession.delete(myGuest);
    }


}

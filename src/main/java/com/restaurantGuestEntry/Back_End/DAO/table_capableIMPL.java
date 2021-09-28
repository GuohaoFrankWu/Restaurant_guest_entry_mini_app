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
public class table_capableIMPL implements forTable{
    private final EntityManager table_entity;

    @Autowired
    public table_capableIMPL(EntityManager table_entity) {
        this.table_entity = table_entity;
    }

    @Override
    @Transactional
    public List<tables_capable> findAll() {
        Session currentSession = table_entity.unwrap(Session.class);
        Query<tables_capable> myQuery = currentSession.createQuery("from counters");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession = table_entity.unwrap(Session.class);
        return currentSession.get(tables_capable.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(tables_capable capable) {
        Session currentSession = table_entity.unwrap(Session.class);
        currentSession.saveOrUpdate(capable);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = table_entity.unwrap(Session.class);
        tables_capable myTable = currentSession.get(tables_capable.class, theId);
        currentSession.delete(theId);
    }


}

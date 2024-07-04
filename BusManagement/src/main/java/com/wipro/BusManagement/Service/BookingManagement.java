package com.wipro.BusManagement.Service;

import com.wipro.BusManagement.Entity.Booking;
import com.wipro.BusManagement.Entity.User;
import com.wipro.BusManagement.Model.BookingDetails;
import com.wipro.BusManagement.Repository.BookingRepository;
import com.wipro.BusManagement.Repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingManagement {
    
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    UserRepository user;

    @Autowired
    EntityManager em;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public List<Booking> getBookingHistory(){
        return bookingRepository.findAll();
    }

    public List<User> getUsers(){
        return user.findAll();
    }

    public void addUser(User user){
//        User u=em.find(User.class,user);
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(user); //em.merge(u); for updates
        em.getTransaction().commit();
        em.close();
    }

//    public void bookTicket(Booking bk){
////        User u=em.find(User.class,user);
//        EntityManager em = entityManagerFactory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(bk); //em.merge(u); for updates
//        em.getTransaction().commit();
//        em.close();
//    }
}

package com.wipro.BusManagement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.BusManagement.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

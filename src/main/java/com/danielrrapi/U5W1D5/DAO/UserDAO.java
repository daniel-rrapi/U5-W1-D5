package com.danielrrapi.U5W1D5.DAO;

import com.danielrrapi.U5W1D5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

}

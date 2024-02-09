package com.danielrrapi.U5W1D5.services;

import com.danielrrapi.U5W1D5.DAO.UserDAO;
import com.danielrrapi.U5W1D5.entities.User;
import com.danielrrapi.U5W1D5.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public void saveUser(User user) {
        userDAO.save(user);
    }

    public User findById(long id) throws ItemNotFoundException {
        return userDAO.findById(id).orElseThrow(() ->  new ItemNotFoundException(id));
    }

    public List<User> findAll() { return userDAO.findAll(); }

    public void findByIdAndDelete(long id) {
        User found = this.findById(id);
        userDAO.delete(found);
    }
}

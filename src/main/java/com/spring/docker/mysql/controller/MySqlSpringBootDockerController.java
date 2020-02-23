package com.spring.docker.mysql.controller;

import com.spring.docker.mysql.model.Users;
import com.spring.docker.mysql.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MySqlSpringBootDockerController {

    private static Logger logger = LoggerFactory.getLogger(MySqlSpringBootDockerController.class);
    private UsersRepository usersRepository;

    public MySqlSpringBootDockerController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        logger.info("Fetching all users from MySql database");
        return usersRepository.findAll();
    }

    @GetMapping("/create")
    public void createUser() {
        Users users = new Users();
        users.setUserName("Jeyachandiran");
        users.setSalary(10000);
        users.setDepartmentName("eCommerce");
        usersRepository.save(users);
        logger.info("New user has been inserted to the MySql database");
    }

    @PostMapping
    public void updateUser() {

    }

    @DeleteMapping
    public void deleteUser() {

    }

}

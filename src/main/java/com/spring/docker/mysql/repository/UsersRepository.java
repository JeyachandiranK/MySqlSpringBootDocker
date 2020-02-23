package com.spring.docker.mysql.repository;

import com.spring.docker.mysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}

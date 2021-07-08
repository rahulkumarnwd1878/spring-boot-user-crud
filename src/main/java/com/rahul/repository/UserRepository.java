package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.model.User;

/**
 * The interface User repository.
 *
 * @author Rahul Kumar
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

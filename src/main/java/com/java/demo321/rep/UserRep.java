package com.java.demo321.rep;

import com.java.demo321.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User ,Long> {
}

package com.whoisparis.studentprof.repository;

import com.whoisparis.studentprof.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

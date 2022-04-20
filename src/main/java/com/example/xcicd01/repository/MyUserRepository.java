package com.example.xcicd01.repository;

import com.example.xcicd01.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

}


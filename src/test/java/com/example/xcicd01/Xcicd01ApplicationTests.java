package com.example.xcicd01;

import com.example.xcicd01.model.MyUser;
import com.example.xcicd01.repository.MyUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class Xcicd01ApplicationTests {

    @Autowired
    MyUserRepository myUserRepository;

    @BeforeEach
    void beforeEach() {
        MyUser my = new MyUser();
        my.setEmail("hej@hej.com");
        my.setPassword("viggo");
        myUserRepository.save(my);
    }

    @Test
    void test1() {
        assertEquals(true, myUserRepository.findAll().size()>0);
    }

}

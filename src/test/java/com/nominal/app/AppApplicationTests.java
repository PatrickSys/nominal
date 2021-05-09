package com.nominal.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {
        System.err.println("hotel de 4 y 5 estrellas".contains("hotel de 4 estrellas"));
    }

}

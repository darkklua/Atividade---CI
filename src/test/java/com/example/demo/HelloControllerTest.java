package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HelloControllerTest {

    @Test
    void sampleTest() {
        assertThat("Hello, CI!").isEqualTo("Hello, CI!");
    }
}

package com.example.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:/application-test.properties")
public class ServiceATest {

    @Autowired
    private ServiceA serviceA;

    @MockBean
    private ServiceB serviceB;

    @Test
    public void shouldDoThat() {
        serviceA.doThat();

        verify(serviceB).doThis();
    }
}
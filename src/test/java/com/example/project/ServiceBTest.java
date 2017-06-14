package com.example.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:/application-test.properties")
public class ServiceBTest {

    @Autowired
    private ServiceB serviceB;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    public void shouldCallRestTemplate() {
        serviceB.doThis();

        verify(restTemplate).postForLocation("test", null);
    }
}
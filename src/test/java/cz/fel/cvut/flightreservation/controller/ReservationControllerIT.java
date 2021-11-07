package cz.fel.cvut.flightreservation.controller;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

/**
 * Integration tests for contact form controller
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReservationControllerIT implements WithAssertions {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void createReservationByUnregistered(){

    }
}

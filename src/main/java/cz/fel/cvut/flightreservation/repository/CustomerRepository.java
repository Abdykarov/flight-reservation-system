package cz.fel.cvut.flightreservation.repository;

import cz.fel.cvut.flightreservation.domain.CustomerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerUser, Long> {
}

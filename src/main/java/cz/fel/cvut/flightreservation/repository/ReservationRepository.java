package cz.fel.cvut.flightreservation.repository;

import cz.fel.cvut.flightreservation.domain.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}

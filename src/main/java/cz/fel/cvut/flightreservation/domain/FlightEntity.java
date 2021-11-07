package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FlightEntity extends AbstractEntity{

    LocalDateTime arrivalTime;
    LocalDateTime departureTime;
    String flightCode;

    @ManyToOne
    @JoinColumn(name="airport_departure_id", nullable=false)
    AirportEntity airportDeparture;

    @ManyToOne
    @JoinColumn(name="airport_arrival_id", nullable=false)
    AirportEntity airportArrival;

    @ManyToMany
    Set<FlightScheduler> schedulers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id", referencedColumnName = "id")
    ReservationEntity reservation;

    @ManyToOne
    @JoinColumn(name = "aircraft_id", referencedColumnName = "id")
    AircraftEntity aircraft;
}

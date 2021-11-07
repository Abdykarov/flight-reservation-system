package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationEntity extends AbstractEntity{

    String arrivalCountry;
    String departureCountry;
    String flightClass;
    @Enumerated(EnumType.STRING)
    ReservationState reservationState;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    CustomerUser customerUser;

    @ManyToOne
    @JoinColumn(name="flight_id", nullable=false)
    FlightEntity flight;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    Set<PassengerEntity> passengers;

    @OneToMany(mappedBy="reservation", cascade = CascadeType.ALL)
    List<NotificationEntity> notifications;

}

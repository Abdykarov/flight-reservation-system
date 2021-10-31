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

    @ManyToMany(mappedBy = "reservations")
    Set<UserEntity> clients;

    @OneToMany(mappedBy="reservation")
    List<NotificationEntity> notifications;

    @OneToOne(mappedBy = "reservation")
    PaymentEntity payment;

    @OneToOne(mappedBy = "reservation")
    FlightEntity flight;

}

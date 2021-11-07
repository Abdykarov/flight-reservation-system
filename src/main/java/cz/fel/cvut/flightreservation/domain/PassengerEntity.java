package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PassengerEntity extends AbstractEntity{

    String name;
    String surname;
    String pass;
    String citizenship;
    LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name="reservation_id", nullable=false)
    ReservationEntity reservation;
}

package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class CustomerUser extends UserEntity{

    String citizenship;
    String pass;
    LocalDate birthDate;

    @OneToMany(mappedBy="customerUser")
    Set<ReservationEntity> reservations;
}

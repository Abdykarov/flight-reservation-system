package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity extends AbstractEntity{
    String name;
    String surname;
    LocalDate dateBirth;
    String passNumber;
    String citizenship;
    @ManyToMany
    @JoinTable(
            name = "user_reservation",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "reservation_id"))
    Set<ReservationEntity> reservations;
}

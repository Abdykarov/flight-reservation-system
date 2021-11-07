package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AircraftEntity extends AbstractEntity{

    String aircraftModel;
    int seatsCount;

    @OneToOne(mappedBy = "aircraft")
    FlightEntity flight;

    @OneToMany(mappedBy="aircraft")
    Set<SeatEntity> seats;
}

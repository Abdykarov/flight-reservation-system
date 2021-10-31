package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatEntity extends AbstractEntity{
    String seatName;
    @Enumerated(EnumType.STRING)
    SeatState seatState;

    @ManyToOne
    @JoinColumn(name="aircraft_id", nullable=false)
    AircraftEntity aircraft;

}

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
public class FlightScheduler extends AbstractEntity{
    LocalDateTime schedulerDay;

    @ManyToMany
    Set<FlightEntity> flights;

    @ManyToOne
    @JoinColumn(name="airport_id", nullable=false)
    AirportEntity airport;
}

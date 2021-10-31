package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FlightScheduler extends AbstractEntity{
    LocalDateTime schedulerDay;
    @OneToMany(mappedBy="scheduler")
    Set<FlightEntity> flights;
}

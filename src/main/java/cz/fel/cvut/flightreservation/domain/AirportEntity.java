package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AirportEntity extends AbstractEntity{
    String city;
    String name;
    String country;
}

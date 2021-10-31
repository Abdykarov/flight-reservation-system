package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationEntity extends AbstractEntity{
    String information;
    LocalDateTime time;
    String type;
    @ManyToOne
    @JoinColumn(name="reservation_id", nullable=false)
    ReservationEntity reservation;
}

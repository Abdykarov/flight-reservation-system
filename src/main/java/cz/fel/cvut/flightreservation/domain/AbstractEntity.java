package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedDate
    LocalDateTime modifiedAt;
}

package cz.fel.cvut.flightreservation.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserEntity extends AbstractEntity{

    String name;
    String surname;
    String login;
    String password;
    String phone;
    String email;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<RoleEntity> roles;

}

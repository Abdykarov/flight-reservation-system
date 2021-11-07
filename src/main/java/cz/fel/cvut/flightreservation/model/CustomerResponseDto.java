package cz.fel.cvut.flightreservation.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponseDto {

    Long id;
    String name;
    String surname;
    String login;
    String password;
    String phone;
    String email;
    String pass;
    LocalDate birthDate;

}

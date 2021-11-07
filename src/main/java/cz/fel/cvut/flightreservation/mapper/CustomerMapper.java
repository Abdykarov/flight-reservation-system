package cz.fel.cvut.flightreservation.mapper;

import cz.fel.cvut.flightreservation.domain.CustomerUser;
import cz.fel.cvut.flightreservation.model.CustomerRequestDto;
import cz.fel.cvut.flightreservation.model.CustomerResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerUser toEntity(CustomerRequestDto customerRequestDto);

    CustomerResponseDto toResponse(CustomerUser customerUser);
}

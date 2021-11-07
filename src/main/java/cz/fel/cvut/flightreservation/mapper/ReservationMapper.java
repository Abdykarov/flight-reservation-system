package cz.fel.cvut.flightreservation.mapper;

import cz.fel.cvut.flightreservation.domain.ReservationEntity;
import cz.fel.cvut.flightreservation.model.ReservationRequestDto;
import cz.fel.cvut.flightreservation.model.ReservationResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface ReservationMapper {

    ReservationResponseDto toResponse(ReservationRequestDto reservationRequestDto);

    ReservationEntity toEntity(ReservationRequestDto reservationRequestDto);

}

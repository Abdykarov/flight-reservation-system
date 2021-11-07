package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.ReservationRequestDto;
import cz.fel.cvut.flightreservation.model.ReservationResponseDto;

import java.util.List;

public interface ReservationService {
    
    void createReservation(ReservationRequestDto ReservationRequestDto);

    void deleteReservation(Long id);

    ReservationResponseDto updateReservation(Long ReservationId, ReservationRequestDto ReservationRequestDto);

    List<ReservationResponseDto> findAll();

    ReservationResponseDto findById(Long id);
}

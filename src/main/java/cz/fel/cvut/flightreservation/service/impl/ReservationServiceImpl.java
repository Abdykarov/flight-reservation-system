package cz.fel.cvut.flightreservation.service.impl;

import cz.fel.cvut.flightreservation.model.ReservationRequestDto;
import cz.fel.cvut.flightreservation.model.ReservationResponseDto;
import cz.fel.cvut.flightreservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    @Override
    public void createReservation(ReservationRequestDto ReservationRequestDto) {

    }

    @Override
    public void deleteReservation(Long id) {

    }

    @Override
    public ReservationResponseDto updateReservation(Long ReservationId, ReservationRequestDto ReservationRequestDto) {
        return null;
    }

    @Override
    public List<ReservationResponseDto> findAll() {
        return null;
    }

    @Override
    public ReservationResponseDto findById(Long id) {
        return null;
    }
}

package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.AircraftRequestDto;
import cz.fel.cvut.flightreservation.model.AircraftResponseDto;

import java.util.List;

/**
 * Crud service layer for aircrafts
 * Aircrafts consists model of aircraft, models are different from number of seats
 */
public interface AircraftService {


    void createAircraft(AircraftRequestDto aircraftRequestDto);

    List<AircraftResponseDto> findAll();
}

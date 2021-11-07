package cz.fel.cvut.flightreservation.service.impl;

import cz.fel.cvut.flightreservation.model.AircraftRequestDto;
import cz.fel.cvut.flightreservation.model.AircraftResponseDto;
import cz.fel.cvut.flightreservation.service.AircraftService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AircraftServiceImpl implements AircraftService {

    @Override
    public void createAircraft(AircraftRequestDto aircraftRequestDto) {

    }

    @Override
    public List<AircraftResponseDto> findAll() {
        return null;
    }
}

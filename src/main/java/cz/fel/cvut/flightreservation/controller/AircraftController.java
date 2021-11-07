package cz.fel.cvut.flightreservation.controller;

import cz.fel.cvut.flightreservation.model.AircraftRequestDto;
import cz.fel.cvut.flightreservation.model.AircraftResponseDto;
import cz.fel.cvut.flightreservation.service.AircraftService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/aircrafts/")
public class AircraftController {

    private final AircraftService aircraftService;

    @PostMapping()
    public void addAircraft(@RequestBody AircraftRequestDto aircraftRequestDto){
        aircraftService.createAircraft(aircraftRequestDto);
    }

    @GetMapping
    public List<AircraftResponseDto> findAll(){
        return aircraftService.findAll();
    }

}

package cz.fel.cvut.flightreservation.controller;

import cz.fel.cvut.flightreservation.model.ReservationRequestDto;
import cz.fel.cvut.flightreservation.model.ReservationResponseDto;
import cz.fel.cvut.flightreservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/reservations/")
public class ReservationController {
    
    private final ReservationService reservationService;

    @GetMapping()
    public List<ReservationResponseDto> findAll(){
        return reservationService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReservationResponseDto findById(@PathVariable Long id){
        return reservationService.findById(id);
    }

    @PostMapping("/unregistered")
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservationByUnregisterd(@RequestBody ReservationRequestDto ReservationRequestDto){
        reservationService.createReservationByUnregisteredCustomer(ReservationRequestDto);
    }


    @PostMapping("{customerId}/registered")
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservationByRegistered(@RequestBody ReservationRequestDto ReservationRequestDto, @PathVariable Long customerId){
        reservationService.createReservationByRegisteredCustomer(customerId, ReservationRequestDto);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ReservationResponseDto updateReservation(@PathVariable Long id, @RequestBody ReservationRequestDto reservationRequestDto){
        return reservationService.updateReservation(id, reservationRequestDto);
    }

    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
    
}

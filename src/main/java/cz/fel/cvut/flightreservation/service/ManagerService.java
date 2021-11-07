package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.ManagerRequestDto;
import cz.fel.cvut.flightreservation.model.ManagerResponseDto;

import java.util.List;

/**
 * Manager is able to create new flights, edit, delete them.
 * Is able to edit reservations, add new aircrafts to system, edit customers.
 */
public interface ManagerService {
    
    void createManager(ManagerRequestDto ManagerRequestDto);

    void deleteManager(Long id);

    ManagerResponseDto updateManager(Long ManagerId, ManagerRequestDto ManagerRequestDto);

    List<ManagerResponseDto> findAll();

    ManagerResponseDto findById(Long id);
}

package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.ManagerRequestDto;
import cz.fel.cvut.flightreservation.model.ManagerResponseDto;

import java.util.List;

public interface ManagerService {
    
    void createManager(ManagerRequestDto ManagerRequestDto);

    void deleteManager(Long id);

    ManagerResponseDto updateManager(Long ManagerId, ManagerRequestDto ManagerRequestDto);

    List<ManagerResponseDto> findAll();

    ManagerResponseDto findById(Long id);
}

package cz.fel.cvut.flightreservation.service.impl;

import cz.fel.cvut.flightreservation.model.ManagerRequestDto;
import cz.fel.cvut.flightreservation.model.ManagerResponseDto;
import cz.fel.cvut.flightreservation.service.ManagerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {


    @Override
    public void createManager(ManagerRequestDto ManagerRequestDto) {

    }

    @Override
    public void deleteManager(Long id) {

    }

    @Override
    public ManagerResponseDto updateManager(Long ManagerId, ManagerRequestDto ManagerRequestDto) {
        return null;
    }

    @Override
    public List<ManagerResponseDto> findAll() {
        return null;
    }

    @Override
    public ManagerResponseDto findById(Long id) {
        return null;
    }
}

package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.ReservationRequestDto;
import cz.fel.cvut.flightreservation.model.ReservationResponseDto;

import java.util.List;

/**
 * Service creates reservation by 2 ways:
 * 1) Unregistered customer reserves, sends own and other passangers information
 * 2) Registered customer has data in database, only sends other passangers information
 * Business logic:
 * 1) Customer chooses flight
 * 2) Adds passengers and reserves seats
 * 3) Make payment
 * 4) Email notification automatically sends backward to the customer
 * 5) Can edit or cancel reservation
 * 6) Can view reservations on website, tisk in pdf format
 */
public interface ReservationService {

    /**
     * Method creates reservation by unregistered customer.
     * Creates passengers entities, changes aircraft seats status, makes system notification,
     * sends email notification to customer email, finds appropriate flight and saves reservation entity to the db;
     * @param ReservationRequestDto
     */
    void createReservationByUnregisteredCustomer(ReservationRequestDto ReservationRequestDto);

    /**
     * Method creates reservation by registered customer.
     * Finds customer entity, creates passengers entities, changes aircraft seats status, makes system notification,
     * sends email notification to customer email, finds appropriate flight and saves reservation entity to the db;
     * @param ReservationRequestDto
     */
    void createReservationByRegisteredCustomer(Long customerId, ReservationRequestDto ReservationRequestDto);

    /**
     * Deletes reservation, all passangers,
     * @param id
     */
    void deleteReservation(Long id);

    /**
     * Updates reservation
     * @param ReservationId - id of existing reservation
     * @param ReservationRequestDto - dto with new data
     * @return returns reservation response dto
     */
    ReservationResponseDto updateReservation(Long ReservationId, ReservationRequestDto ReservationRequestDto);

    /**
     * Finds all reseravtions
     * @return
     */
    List<ReservationResponseDto> findAll();

    /**
     * Finds reservation by his id
     * @param id of resrvation
     * @returns reservation dto
     */
    ReservationResponseDto findById(Long id);
}

package Service;

import Repository.AirportRepository;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.stereotype.Service;
import com.driver.model.Airport;
import java.util.*;
@Service
public class AirportService {

    AirportRepository airportRepository = new AirportRepository();
    public String addAirport(Airport airport){

        return airportRepository.addAirport(airport);
    }

    public String getLargestAirportName(){

        return airportRepository.getLargestAirportName();
    }

    public double getShortestDurationOfPossibleBetweenTwoCities(City fromCity, City toCity){

        return airportRepository.getShortestDurationOfPossibleBetweenTwoCities(fromCity,toCity);
    }

    public int getNumberOfPeopleOn( Date date, String airportName){

        return airportRepository.getNumberOfPeopleOn(date,airportName);
    }
    public int calculateFlightFare(Integer flightId){

        return airportRepository.calculateFlightFare(flightId);
    }
    public String bookATicket(Integer flightId,Integer passengerId){


        return airportRepository.bookATicket(flightId,passengerId);
    }

    public String cancelATicket(Integer flightId,Integer passengerId){

        return airportRepository.cancelATicket(flightId,passengerId);
    }

    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId){

        //Tell the count of flight bookings done by a passenger: This will tell the total count of flight bookings done by a passenger :
        return airportRepository.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }


    public String addFlight(Flight flight){

        return airportRepository.addFlight(flight);
    }


    public String getAirportNameFromFlightId(Integer flightId){

        return airportRepository.getAirportNameFromFlightId(flightId);
    }

    public int calculateRevenueOfAFlight(Integer flightId){

        return airportRepository.calculateRevenueOfAFlight(flightId);
    }

    public String addPassenger(Passenger passenger){

        //Add a passenger to the database
        //And return a "SUCCESS" message if the passenger has been added successfully.

        return airportRepository.addPassenger(passenger);
    }

}

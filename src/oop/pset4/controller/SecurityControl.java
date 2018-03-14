package oop.pset4.controller;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class SecurityControl {

    private List<Luggage> rejectedLuggage = new ArrayList<>();

    public boolean isAllowedToTravel(Luggage luggage) {
        if (isOnTime(luggage)){
            return true;
        }
        rejectedLuggage.add(luggage);
        return false;
        // validate that the luggage arrived at least 30 minutes before departure time
        // counting between the drop off time and the departure time
        // remember the luggage that has been rejected in order to facilitate it later on
    }

    private boolean isOnTime(Luggage luggage) {

        LocalDateTime DeadLine = luggage.getDepartureTime().minusMinutes(30);
        LocalDateTime dropOffTime = luggage.getDropOffTime();
        return dropOffTime.isBefore(DeadLine);
    }

    public List<Luggage> getRejectedLuggage() {
        return rejectedLuggage;
    }
}

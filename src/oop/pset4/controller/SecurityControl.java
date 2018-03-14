package oop.pset4.controller;

import oop.pset4.model.Luggage;

import java.util.ArrayList;
import java.util.List;

public class SecurityControl {

    private List<Luggage> rejectedLuggage = new ArrayList<>();

    public boolean isAllowedToTravel(Luggage luggage) {
        // validate that the luggage arrived at least 30 minutes before departure time
        // counting between the drop off time and the departure time
        // remember the luggage that has been rejected in order to facilitate it later on

        return false;
    }

    public List<Luggage> getRejectedLuggage() {
        return rejectedLuggage;
    }
}

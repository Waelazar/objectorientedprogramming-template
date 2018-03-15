package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add travel duration to the processing time
        Duration flightDuration = luggage.getFlightDuration();
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration updateDurationTime = waitingDuration.plus(flightDuration);
        luggage.setWaitingDuration(updateDurationTime);

        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime updateArrivalTime = departureTime.plus(luggage.getFlightDuration());
        luggage.setArrivalTime(updateArrivalTime);
        return luggage;
    }
}

package oop.pset4.controller;

import oop.pset4.controller.travelstage.*;
import oop.pset4.model.Luggage;
import oop.pset4.view.SummaryReporter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Airport {

    private SecurityControl securityControl = new SecurityControl();

    private TravelStage dropOff = new DropOffStand();
    private TravelStage storageArea = new StorageArea();
    private TravelStage transportCart = new TransportCart();
    private TravelStage flight = new Flight();
    private TravelStage luggageClaim = new LuggageClaim();

    private SummaryReporter summaryReporter = new SummaryReporter();

    public List<Luggage> travel(List<Luggage> departureLuggage) {
        // TODO apply airport travel stages per the following order

        // show a welcome message
        // allow passengers to travel only if they show up at least 30 mins before departure time
        List<Luggage> rejectedLuggege = departureLuggage.stream()
                .filter(e -> securityControl.isAllowedToTravel(e) == false)
                .collect(Collectors.toList());

        List<Luggage> acceptedLuggege = departureLuggage.stream()
                .filter(e -> securityControl.isAllowedToTravel(e) == true)
                .collect(Collectors.toList());
        // drop the luggage at the drop off stan
        departureLuggage.forEach(e -> dropOff.process(e));
        // bring the luggage to the storage area
        departureLuggage.forEach(e -> storageArea.process(e));
        // carry the luggage to the plane with the transport cart
        departureLuggage.forEach(e -> transportCart.process(e));
        // flight to the destination
        departureLuggage.forEach(e -> flight.process(e));
        // carry the luggage to the luggage claim with the transport cart
        departureLuggage.forEach(e -> transportCart.process(e));
        // pick up the luggage from the luggage claim
        departureLuggage.forEach(e -> luggageClaim.process(e));

        // display luggage report summary for rejected luggage
        summaryReporter.reportRejected(rejectedLuggege);
        // display luggage report summary for accepted luggage
        summaryReporter.reportAccepted(acceptedLuggege);

        return acceptedLuggege;
    }


}

package oop.pset1.view;

import oop.pset1.module.Summary;

import java.util.List;

public class SummaryDisplayer {
    public void DisplaySummary(Summary summary) {
        System.out.println("Top rated Movies:");
        System.out.println(" ------------ ");

        List<String> mostAppearingMovie = summary.getMostAppearingMovie();
        mostAppearingMovie.forEach(e -> System.out.println(e));
    }
}

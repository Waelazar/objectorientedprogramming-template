package oop.pset1.view;

import com.sun.javafx.collections.MappingChange;
import oop.pset1.module.Summary;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SummaryDisplayer {
    public void DisplaySummary(Summary summary) throws IOException{
        List<String> mostRatedFilms = summary.getMostRatedFilms();
        mostRatedFilms.forEach(System.out::println);

        System.out.println("top Apperaing Movies:");
        System.out.println(" ------------ ");

        Map<Object, Long> topApperaingMovies = summary.getMostAppearingMovie();
        topApperaingMovies.entrySet().stream()
//                        .sorted(Comparator.comparing(Map.Entry::getValue))
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .limit(2)
                        .map(e -> e.getKey() + " (" + e.getValue() + ")")
                        .forEach(System.out::println);

        System.out.println("top Appearing Actors:");
        System.out.println(" ------------ ");

        List<String> topHiredActors = summary.getMostHiredActors();
        System.out.println(topHiredActors);
    }
}

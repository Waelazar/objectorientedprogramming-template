package oop.pset1.controller;


import oop.pset1.module.Actors;
import oop.pset1.module.Movie;
import oop.pset1.module.Summary;

import java.util.*;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {
    public Summary summarize(List<Movie> movieList) {
        List<String> topRatedFilms = movieList.stream()
                .sorted((e1 , e2) -> e2.getVote_avarrage().compareTo(e1.getVote_avarrage()))
                .limit(5)
                .map(e -> e.getTitle() + " (" + e.getVote_avarrage() + ")")
                .collect(Collectors.toList());

        Map<Object, Long> topApperaingMovies = movieList.stream()
                .map(Movie::getGeneres)
//                .flatMap(e -> Arrays.stream(e.toArray()))
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


        Summary summary = new Summary();
        summary.setMostRatedFilms(topRatedFilms);
        summary.setMostAppearingMovie(topApperaingMovies);

        return summary ;
    }

    public Summary actorsSummarize(List<Actors> actorsList){
        Map<Object, Long> appearances = actorsList.stream()
                .map(Actors::getName)
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> topApperaingActors = appearances.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .filter(Objects::nonNull)
                .limit(2)
                .map(e -> e.getKey() + " (" + e.getValue() + ")")
                .collect(Collectors.toList());

        Summary summary = new Summary();
        summary.setMostHiredActors(topApperaingActors);

        return summary;
    }
}


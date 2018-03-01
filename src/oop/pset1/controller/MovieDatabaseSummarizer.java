package oop.pset1.controller;


import oop.pset1.module.Movie;
import oop.pset1.module.Summary;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {
    public Summary summarize(List<Movie> movieList) {
        List<String> topApperaingMovies = movieList.stream()
                .sorted((e1 , e2) -> e2.getVote_avarrage().compareTo(e1.getVote_avarrage()))
                .limit(5)
                .map(e -> e.getTitle() + " (" + e.getVote_avarrage() + ")")
                .collect(Collectors.toList());

        Summary summary = new Summary();
        summary.setMostAppearingMovie(topApperaingMovies);

        return summary;

    }
}


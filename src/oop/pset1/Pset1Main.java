package oop.pset1;

import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.module.Actors;
import oop.pset1.module.Movie;
import oop.pset1.module.Summary;
import oop.pset1.parser.ActorsParser;
import oop.pset1.parser.ReadFilePath;
import oop.pset1.view.SummaryDisplayer;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Pset1Main {

    public static void main(String[] args) {

        ReadFilePath parser = new ReadFilePath();
        String MovieFilePath = "src/oop/pset1/data/movies.csv";
        List<Movie> movies = parser.asList(MovieFilePath).stream()
                .map(e -> (Movie) e)
                .collect(Collectors.toList());

        // get summarized answers from the List of Movies
        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        Summary summary = summarizer.summarize(movies);
        // display the summary
        SummaryDisplayer MovieDisplayer = new SummaryDisplayer();
        try {
            MovieDisplayer.DisplaySummary(summary);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ActorsParser actorsParser = new ActorsParser();
        List<Actors> actors = actorsParser.actorsList().stream()
                .map(e -> (Actors) e)
                .collect(Collectors.toList());

        MovieDatabaseSummarizer actorsSummarizer = new MovieDatabaseSummarizer();
        Summary actorsSummarizer1 = actorsSummarizer.actorsSummarize(actors);

        SummaryDisplayer ActorDisplayer = new SummaryDisplayer();
        ActorDisplayer.DisplaySummaryActors(actorsSummarizer1);

    }
}

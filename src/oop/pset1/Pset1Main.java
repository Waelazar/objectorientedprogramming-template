package oop.pset1;

import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.module.Movie;
import oop.pset1.module.Summary;
import oop.pset1.parser.ReadFilePath;
import oop.pset1.view.SummaryDisplayer;

import java.util.List;
import java.util.stream.Collectors;

public class Pset1Main {

    public static void main(String[] args) {
/// /        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
//        SummaryDisplayer displayer = new SummaryDisplayer();
//
//        Optional<Summary> summary = summarizer.summarize();
//        if(summary.isPresent()){
//            displayer.display(summary.get());
//        } else {
//            displayer.display();
//        }

        ReadFilePath parser = new ReadFilePath();
        String filePath = "src/oop/pset1/data/movies.csv";
        List<Movie> Movies = parser.asList(filePath).stream()
                .map(e -> (Movie) e)
                .collect(Collectors.toList());
        // get summarized answers from the List of Reviews
        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        Summary summary = summarizer.summarize(Movies);

        // display the summary
        SummaryDisplayer displayer = new SummaryDisplayer();
        displayer.DisplaySummary(summary);

    }
}

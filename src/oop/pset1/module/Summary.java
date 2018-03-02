package oop.pset1.module;

import java.util.List;
import java.util.Map;

public class Summary {
    private List<String> mostRatedFilms;
    private Map<Object, Long> mostAppearingMovie;
    private List<String> mostHiredActors;

    public Map<Object, Long> getMostAppearingMovie() {
        return mostAppearingMovie;
    }

    public void setMostAppearingMovie(Map<Object, Long> mostAppearingMovie) {
        this.mostAppearingMovie = mostAppearingMovie;
    }

    public List<String> getMostRatedFilms() {
        return mostRatedFilms;
    }

    public void setMostRatedFilms(List<String> mostRatedFilms) {
        this.mostRatedFilms = mostRatedFilms;
    }

    public List<String> getMostHiredActors() {
        return mostHiredActors;
    }

    public void setMostHiredActors(List<String> mostHiredActors) {
        this.mostHiredActors = mostHiredActors;
    }
}

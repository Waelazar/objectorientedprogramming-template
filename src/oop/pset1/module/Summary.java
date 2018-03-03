package oop.pset1.module;

import java.util.List;
import java.util.Map;

public class Summary {
    private List<String> mostRatedFilms;
    private Map<Object, Long> mostAppearingMovie;
    private Map<Object, Long> mostHiredActors;

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

    public Map<Object, Long> getMostHiredActors() {
        return mostHiredActors;
    }

    public void setMostHiredActors(Map<Object, Long> mostHiredActors) {
        this.mostHiredActors = mostHiredActors;
    }
}

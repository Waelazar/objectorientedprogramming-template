package oop.pset1.module;

import java.util.List;

public class Movie {
    private List<String> generes;
    private String title;
    private Double vote_avarrage;

    public Movie(){

    }

    public Movie(List<String> generes, String title, Double vote_avarrage) {
        this.generes = generes;
        this.title = title;
        this.vote_avarrage = vote_avarrage;
    }


    public List<String> getGeneres() {
        return generes;
    }

    public void setGeneres(List<String> generes) {
        this.generes = generes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVote_avarrage() {
        return vote_avarrage;
    }

    public void setVote_avarrage(Double vote_avarrage) {
        this.vote_avarrage = vote_avarrage;
    }

}

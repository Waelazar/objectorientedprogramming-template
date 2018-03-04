package oop.pset2.controller;

import oop.pset2.module.Moves;
import oop.pset2.module.Paper;
import oop.pset2.module.Rock;
import oop.pset2.module.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovesType {

    private List<Moves> moves;


    public MovesType() {
        moves = Stream.of(
                new Paper(),
                new Rock(),
                new Scissors()
        ).collect(Collectors.toList());
    }

    public List<Moves> getMoves() {
        return new ArrayList<>(moves);
    }

    public void setMoves(List<Moves> moves) {
        this.moves = moves;
    }
}

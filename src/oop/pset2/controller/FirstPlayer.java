package oop.pset2.controller;

import oop.pset2.module.Moves;

import java.util.Collections;
import java.util.List;

public class FirstPlayer implements Players{

    @Override
    public Moves maketheMove(MovesType move) {
        List<Moves> moves = move.getMoves();
        Collections.shuffle(moves);
        return moves.get(0);
    }
}

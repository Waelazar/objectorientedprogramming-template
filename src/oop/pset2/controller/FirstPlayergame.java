package oop.pset2.controller;

import oop.pset2.module.Moves;
import oop.pset2.view.Jury;

public class FirstPlayergame {


    public void play() {
        MovesType movesType = new MovesType();
        FirstPlayer firstPlayer = new FirstPlayer();
        SecondPlayer secondPlayer = new SecondPlayer();

        Moves move1 = firstPlayer.maketheMove(movesType);
        Moves move2 = secondPlayer.maketheMove(movesType);

        Jury jury = new Jury();
        jury.sayResult(move1 , move2);

    }
}

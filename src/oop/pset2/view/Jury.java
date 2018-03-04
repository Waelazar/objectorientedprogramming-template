package oop.pset2.view;

import oop.pset2.module.Moves;

import java.util.Scanner;

public class Jury {
    public void sayResult(Moves move1, Moves move2) {
        System.out.println("The First Player picked: " + move1.getMove());
        System.out.println("The Second Player picked: " + move2.getMove());

        if (move1.getMove().equalsIgnoreCase("Rock") && move2.getMove().equalsIgnoreCase("Paper")){
            System.out.println("First Player won");
        }
        else if (move1.getMove().equalsIgnoreCase("Rock") && move2.getMove().equalsIgnoreCase("Scissor")){
            System.out.println("Second Player won");
        }
        else if (move1.getMove().equalsIgnoreCase("Paper") && move2.getMove().equalsIgnoreCase("Rock")) {
            System.out.println("First Player won");
        }
        else if (move1.getMove().equalsIgnoreCase("Paper") && move2.getMove().equalsIgnoreCase("Scissor")){
            System.out.println("Second Player won");
        }
        else if (move1.getMove().equalsIgnoreCase("Scissor") && move2.getMove().equalsIgnoreCase("Rock")){
            System.out.println("Second Player won");
        }
        else if (move1.getMove().equalsIgnoreCase("Scissor") && move2.getMove().equalsIgnoreCase("Paper")){
            System.out.println("First Player won");
        }
        else {
            System.out.println("no one won");
        }

    }
}

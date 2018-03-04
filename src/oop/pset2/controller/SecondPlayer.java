package oop.pset2.controller;

import oop.pset2.module.Moves;

import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondPlayer implements Players{
    @Override
    public Moves maketheMove(MovesType move) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make you move : ");
        show(move);
        System.out.print("Your Move is: ");
        String choice = scanner.nextLine();
        return toMove(choice,move);
    }

    private Moves toMove(String choice, MovesType move) {
        return move.getMoves().stream()
                .filter(e -> e.getMove().equalsIgnoreCase(choice))
                .findFirst().get();
    }

    private void show(MovesType move) {
        String moves = move.getMoves().stream()
                .map(e -> e.getMove())
                .collect(Collectors.joining(", "));
        System.out.println(moves);
    }
}

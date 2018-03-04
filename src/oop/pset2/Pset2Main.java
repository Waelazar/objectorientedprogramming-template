package oop.pset2;

import oop.pset2.controller.FirstPlayergame;

import java.util.Scanner;

public class Pset2Main {

    public static void main(String[] args) {
        new FirstPlayergame().play();
        while (playAgin()){
            new FirstPlayergame().play();
        }
    }

    private static boolean playAgin() {
        System.out.print("Do you want to play again? (y/n): ");
        Scanner scan = new Scanner(System.in);
        String playAgin = scan.nextLine();
        if (playAgin.equalsIgnoreCase("y")){
            return true;
        }
        else{
            System.out.println("Goodbye");
            return false;
        }
    }
}

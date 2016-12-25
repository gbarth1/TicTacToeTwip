package com.company;
import java.util.*;
import java.io.*;
public class Main
{

    public static void main(String[] args)
    {
        board bd = new board();

        System.out.print("Who is playing first? x or o? ");
        Scanner kb= new Scanner(System.in);
        String XorO=kb.next();

        for(int i=0;i<9;i++) {

            System.out.print("Input row: ");
            int rw = kb.nextInt();

            System.out.print("Input col: ");
            int cl = kb.nextInt();

            boolean validMove = bd.setBoard(rw, cl, XorO);

            bd.printBoard();

            if (bd.checkForWinner()){
                System.out.println("Congrats " + XorO + " you won!");
                break;
        }

        if(validMove) {
            if (XorO.equals("x")) {
                XorO = "o";
            } else {
                XorO = "x";
            }
        }
        }
        System.out.println("You tied :/");
    }
}

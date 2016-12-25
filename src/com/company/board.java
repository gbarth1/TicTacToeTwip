package com.company;

/**
 * Created by gb647 on 12/19/16.
 */
public class board
{

    public board()
    {
        array = new String[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                array[i][j] = "0";
            }
        }
    }

    public void printBoard() {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                if(i==1||i==3) {System.out.print('-');}
                else if(j==1 || j==3) {System.out.print('|');}
                else {System.out.print(array[i/2][j/2]);}
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setBoard(int row, int col, String c) {

        if (array[row][col].equals(0)){
            array [row][col]=c;
        }
        else{
            System.out.println("Sorry this spot is already taken");
        }
    }

    public boolean checkForWinner(){


        for(int i=0;i<3;i++) {
            if (!array[i][0].equals("0") && array[i][0].equals(array[i][1]) && array[i][1].equals(array[i][2])) {
                return true;
            }
            if (!array[0][i].equals("0") && array[0][i].equals(array[1][i]) && array[1][i].equals(array[2][i])) {
                     return true;
            }
        }
            if(!array[0][0].equals("0") && array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])){
               return true;
            }
            if(!array[0][2].equals("0") && array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0])){
                return true;
            }
            return false;
    }

    public String array[][];
}

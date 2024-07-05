//Implementing a  TIC-TAC-TOE Game between 2 players

import java.util.*;

public class tictac {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                board[r][c]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner sc=new Scanner(System.in);

        while(!gameover){
            printboard(board);
            System.out.println("player " +player+" enter:");
            int r=sc.nextInt();
            int c=sc.nextInt();
            System.out.println();
            if(board[r][c]== ' '){
                board[r][c]=player;
                gameover= havewon(board,player);
                if(gameover){
                    System.out.println("Player "+ player+ " has won:");
                }

                else{
                    if(player =='X'){
                        player='0';
                    }
                    else{
                        player='X';
                    }
                }
            }
            else{
                System.out.println("Invalid move");
            }
        }
        printboard(board);
        sc.close();
}
        public static boolean havewon(char[][] board,char player){
            for(int r=0;r<board.length;r++){
        
                if(board[r][0] == player &&board[r][1] == player && board[r][2] == player){
                    return true;
                }
                
            }
    
            if(board[0][0] ==player && board[1][1]== player && board[2][2]== player){
                return true;
            }
            if(board[0][2] ==player && board[1][1]== player && board[2][0]== player){
                return true;
            }
            if(board[0][1] ==player && board[1][1]== player && board[2][1]== player){
                return true;
            }
            if(board[0][0] ==player && board[1][0]== player && board[2][0]== player){
                return true;
            }
            if(board[0][2] ==player && board[1][2]== player && board[2][2]== player){
                return true;
            }
            
            return false;
        }
        public static void printboard(char[][] board){
            for(int r=0;r<board.length;r++){
                System.out.println("------------");
                for(int c=0;c<board.length;c++){
                    System.out.print(board[r][c]+" | ");
                }
    
                System.out.println();
            }
    }
}

//SAMPLE OUTPUT

/*
 ------------
  |   |   | 
------------
  |   |   | 
------------
  |   |   | 
player X enter:
1 2

------------
  |   |   |
------------
  |   | X |
------------
  |   |   |
player 0 enter:
0 1

------------
  | 0 |   |
------------
  |   | X |
------------
  |   |   |
player X enter:
0 2

------------
  | 0 | X | 
------------
  |   | X | 
------------
  |   |   | 
player 0 enter:
0 0

------------
0 | 0 | X | 
------------
  |   | X | 
------------
  |   |   | 
player X enter:
1 1

------------
0 | 0 | X | 
------------
  | X | X | 
------------
  |   |   | 
player 0 enter:
1 0

------------
0 | 0 | X | 
------------
0 | X | X | 
------------
  |   |   | 
player X enter:
2 1

------------
0 | 0 | X |
------------
0 | X | X |
------------
  | X |   |
player 0 enter:
2 0

Player 0 has won:
------------
0 | 0 | X |
------------
0 | X | X |
------------
0 | X |   |
 */
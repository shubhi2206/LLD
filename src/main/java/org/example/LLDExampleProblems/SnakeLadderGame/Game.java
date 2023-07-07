package org.example.LLDExampleProblems.SnakeLadderGame;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10,4,5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player p1 = new Player("p1",0);
        Player p2 = new Player("p2",0);
        players.add(p1);
        players.add(p2);
    }

    public void playGame(){

        while(winner == null){
            Player playerTurn = getPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);

            int diceRoll = dice.rollDice();
            int newPos = playerTurn.currentPosition + diceRoll;
            newPos = getNewPosition(newPos);
            playerTurn.currentPosition = newPos;

            System.out.println("player turn is:" + playerTurn.id + " new position is: " + playerTurn.currentPosition);
            if(newPos >= board.cells.length * board.cells.length-1){
                winner = playerTurn;
            }
        }

        System.out.println("Winner is: " + winner.id);

    }

    private Player getPlayerTurn() {
        Player p = players.removeFirst();
        players.addLast(p);
        return p;
    }

    private int getNewPosition(int pos){
        if(pos > board.cells.length * board.cells.length - 1)
            return pos;
        Cell cell = board.getCell(pos);
        if(cell.jump != null && cell.jump.start == pos){
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("Jump done by: " + jumpBy);
            return cell.jump.end;
        }

        return pos;
    }


}

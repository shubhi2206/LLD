package org.example.LLDExampleProblems.SnakeLadderGame;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int size, int snakes, int ladders){
        initializeCells(size);
        initializeSnakesLadders(snakes,ladders);

    }

    private void initializeCells(int size){
        cells = new Cell[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Cell cellobj = new Cell();
                cells[i][j] = cellobj;
            }
        }
    }

    private void initializeSnakesLadders(int snakes, int ladders){
        while(snakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length - 1);
            if(snakeTail >= snakeHead)
                continue;

            Jump snakeobj = new Jump();
            snakeobj.start = snakeHead;
            snakeobj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeobj;

            snakes--;

        }

        while(ladders > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length - 1);
            if(ladderHead >= ladderTail)
                continue;

            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;

            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;

            ladders--;

        }
    }

    Cell getCell(int position){
        int row = position / cells.length;
        int col = position % cells.length;

        return cells[row][col];
    }
}

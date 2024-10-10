package com.sudokusolver;

public class Main {

	 public static void main(String[] args) {
	        int[][] board = {
	            {5, 3, 0, 0, 7, 0, 0, 0, 0},
	            {6, 0, 0, 1, 9, 5, 0, 0, 0},
	            {0, 9, 8, 0, 0, 0, 0, 6, 0},
	            {8, 0, 0, 0, 6, 0, 0, 0, 3},
	            {4, 0, 0, 8, 0, 3, 0, 0, 1},
	            {7, 0, 0, 0, 2, 0, 0, 0, 6},
	            {0, 6, 0, 0, 0, 0, 2, 8, 0},
	            {0, 0, 0, 4, 1, 9, 0, 0, 5},
	            {0, 0, 0, 0, 8, 0, 0, 7, 9}
	        };

	        SudokuBoard sudokuBoard = new SudokuBoard(board);
	        Solver solver = new Solver(sudokuBoard);

	        System.out.println("Original Board:");
	        printBoard(sudokuBoard.getBoard());

	        if (solver.solve()) {
	            System.out.println("Solved Board:");
	            printBoard(sudokuBoard.getBoard());
	        }
	    }

	    public static void printBoard(int[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[0].length; j++) {
	                System.out.print(board[i][j] + " ");
	                if ((j + 1) % 3 == 0 && j < 8) {
	                    System.out.print("| ");
	                }
	            }
	            System.out.println();
	            if ((i + 1) % 3 == 0 && i < 8) {
	                System.out.println("------+-------+------");
	            }
	        }
	    }
	}

	
	    


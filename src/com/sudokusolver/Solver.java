package com.sudokusolver;
import java.util.Stack;
import java.util.HashSet;

public class Solver {


	    private SudokuBoard board;
	    private Stack<Cell> stack;

	    public Solver(SudokuBoard board) {
	        this.board = board;
	        this.stack = new Stack<>();
	    }

	    public boolean solve() {
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                if (board.getBoard()[i][j] == 0) {
	                    for (int num = 1; num <= 9; num++) {
	                        if (isValid(i, j, num)) {
	                            Cell cell = new Cell(i, j, num);
	                            stack.push(cell);
	                            board.getBoard()[i][j] = num;
	                            if (solve()) {
	                                return true;
	                            }
	                            board.getBoard()[i][j] = 0;
	                            stack.pop();
	                        }
	                    }
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	    private boolean isValid(int row, int col, int num) {
	        // Check row
	        for (int i = 0; i < 9; i++) {
	            if (board.getBoard()[row][i] == num) {
	                return false;
	            }
	        }

	        // Check column
	        for (int i = 0; i < 9; i++) {
	            if (board.getBoard()[i][col] == num) {
	                return false;
	            }
	        }

	        // Check box
	        int boxRow = row - row % 3;
	        int boxCol = col - col % 3;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board.getBoard()[boxRow + i][boxCol + j] == num) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}





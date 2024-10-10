# Sudoku Solver

INTRODUCTION-

The Sudoku Solver Project is designed to develop a program that solves Sudoku puzzles automatically. Sudoku is a popular puzzle game where players fill a 9x9 grid with numbers from 1 to 9, following specific rules.

    



## LOGIC OF THE PROBLEM

Step 1: Understand the Problem

- Sudoku is a 9x9 grid divided into 9 3x3 sub-grids (regions)
- Each region, row, and column must contain numbers 1-9 without repetition
- The program should take an incomplete Sudoku grid as input and fill it correctly

Step 2: Represent the Grid

- Use a 2D array (9x9) to represent the Sudoku grid
- Initialize the grid with given values (0 for empty cells)
Step 3: Solve the Sudoku

- Find Empty Cells: Iterate through the grid to find empty cells (0)
- Check Valid Numbers: For each empty cell, check which numbers (1-9) are valid
 Check row, column, and region constraints

- Recursion: If a valid number is found, recursively call the solve function
   Backtracking: If no valid number is found, backtrack to previous cell

 Step 4:Implement the Algorithm
 -Create a function solveSudoku(grid) to solve the Sudoku 
 -Use recursion and backtracking to fill the grid 
 -Implement row, column, and region checks


## Features

- Solves Sudoku puzzles
- Developed in Eclipse
- Written in Java


## Usage

- Clone the repository.
- Import into Eclipse.
- Run the project.


## Requirements

- Eclipse IDE
- Java 8 or higher

## Screenshots

![SudokuBoard](https://github.com/user-attachments/assets/d63fc430-b62f-43f9-ab56-03f9db5d9577))


## License

[MIT](https://choosealicense.com/licenses/mit/)


## Contributing

- Kashish Varshney (varshneykashish76@gmail.com)


## Badges

 [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)






## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](http://www.linkedin.com/in/kashish-varshney-166333273)
[![Github](https://img.shields.io/badge/Github-1DA1F2?style=for-the-badge&logo=GITHUB&logoColor=white)](https://github.com/KashishV2)







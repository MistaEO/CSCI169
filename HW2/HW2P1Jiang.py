# In this problem, you will write a Python program to solve the 8-Queens problem.  In chess, a queen can move any number of squares horizontally,
# vertically, or diagonally.   
# The 8-queens problem is the problem of trying to place eight queens on an empty chessboard in such a way that no queen can attack any other queen.  
# This problem is intriguing because there is no efficient algorithm known for solving the general problem.  
# Rather, the straightforward algorithm of trying all possible placements is most often used in practice, 
# with the only optimization being that each queen must be placed in a separate row and column:
# Starting with the first row, try to place a queen in the current column.
# If you can safely place a queen in that column, move on to the next column
# If you are unable to safely place a queen in that column, go back to the previous column,
# and move that queen down to the next row where it can safely be placed. Move on to the next column.
# Write a program in python to solve the 8-queens problem.
# Your program should produce as output an 8X8 diagram of the chessboard,
# with a 1 indicating the presence of a queen in a square and a 0 indicating the absence of a queen.  
# You need to show the first solution found.


# we will be visualizing board[0][0] as the top left corner

def is_safe(board, row, col):
    # checking the part of the row that is left of the provided tile
    for j in range(col):
        if (board[row][j]):
            return False

    # checking left diagonal opposite 0,0 towards 7,0
    for i, j in zip(range(1, 8 - row), range(1, col + 1)):
        if (board[row + i][col - j]):
            return False

    # checking left diagonal towards 0,0
    for i, j in zip(range(1, row + 1), range(1, col + 1)):
        if (board[row - i][col - j]):
            return False

    return True


def solve(board, row, col):
    # we can modify this function later to serve as a generic solution to the n-queen problem
    if (col <= 7):
        # check all tiles in column
        for i in range(8):
            if (is_safe(board, i, col)):
                # place queen on tile i, col
                board[i][col] = 1
                # call solve to check all tiles in the next column
                if solve(board, row, col + 1):
                    return True
                # backtrack if tile does not satisfy our guidelines, prepare for a subsequent iteration through the loop in the next row
                board[i][col] = 0
        return False
    else:
        return True


def solve_8_queen(board):
    solve(board, 0, 0)


def main():
    board = [[0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0]]
    solve_8_queen(board)
    for rows in board:
        print(rows)


if __name__ == "__main__":
    main()

//It is ideal to write the solution using vectors, 
//but to preserve the intent of the Python program,
//I will be using 2-D arrays with the dimensions within the function signature
//Since we know that the board is 8x8 and can only ever be 8x8


fn is_safe(board: &mut [[i32; 8]; 8], row:usize, col:usize) -> bool{
//outer bracket is rows, inner is columns
    //checking the part of the row that is left of the provided tile
    for i in 0..col{
        if(board[row][i] != 0){
            return false;
        }
    }
    //checking left diagonal opposite 0,0 towards 7,0
    for (i,j) in (1..8-row).zip((1..col+1)){
        if(board[row+i][col-j] != 0){
            return false;
        }
    }
    //checking left diagonal towards 0,0
    for(i,j) in (1..row+1).zip((1..col+1)){
        if(board[row-i][col-j] != 0){
            return false;
        }
    }
    return true;
}

fn solve(board: &mut [[i32; 8]; 8], row:usize, col:usize) -> bool{
    if(col <= 7){
        for i in 0..8{
            if (is_safe(board,i,col)){
                board[i][col] = 1;
                if (solve(board,row,col+1)){
                    return true;
                }else{
                    board[i][col] = 0; 
                }
            }
        }
        return false;
    }else{
        return true;
    }
}

fn solve_8_queen(board: &mut [[i32; 8]; 8]) -> (){
    solve(board,0,0);
}

fn main() {
    let mut board:[[i32;8];8] = [[0;8];8];
    //board[0][0] = 2;
    solve_8_queen(&mut board);
    for i in 0..8{
        for j in 0..8{
            print!("{}", board[i][j]);
        }
        println!("");
    }
    

}

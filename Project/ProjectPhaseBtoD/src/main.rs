fn binary_search(A: &[i32],n: i32,T: i32) -> i32{
    let mut L = 0;
    let mut R = n-1;
    while L <= R{
        let m = (L+R)/2;
        if A[m as usize] < T{
            L = m + 1;
        }else if A[m as usize] > T{
            R = m - 1;
        }else{
            return m;
        }
    }
    return -1;
}

fn main() {
    let A = [1,2,3,4,5,6,7,8,9,19,20];
    let n = A.len() as i32;

    println!("{}", binary_search(&A,n,8));
    println!("{}", binary_search(&A,n,20));
    println!("{}", binary_search(&A,n,15));
    println!("{}", binary_search(&A,n,0));


}

object HW5P1to3Jiang extends App{
  /*Write a function is_prime that takes in an integer x and returns true if x is prime and false if it is not.
  To do this, you may write a helper “loop” recursive function that takes one parameter.
  You are welcome to create additional non-recursive helper functions.
  Please define all helper functions inside is_prime.
   */
  def is_prime(x: Int):Boolean = {
    def loop(divisor: Int): Boolean ={
      if (x <= 2){
        if (x == 2){
          return true
        }else{
          return false
        }
      }

      if (x%divisor == 0){
        return false
      }

      if (divisor * divisor > x){
        return true
      }

      loop(divisor+1)
    }
    loop(2)
  }

  /*Consider the function add_third
  def add_third(x:Int):Int = {

        if(x<1) 0

        else x+add_third(x-3)

      }
  You will write a more general version of this function,
  add_fth, where instead of recursing on x-3,
  we will use a function f to find the value we will recurse with.
  To help you get started, here are a couple of questions to answer
  (you don’t need to turn in the answers, just write the function)
  Step 1:  add_fth will take two parameters, a function f, and an Int x.  What should the type of f be?
  Step 2:  How will we use f in the body of the function?
  In addition to the function add_fth,
  include a function call to add_fth that will have the same behavior as a function call to add_third.
  To do this you must first define a function to pass as a parameter to add_fth.
  */
  def add_fth(x:Int, f: Int=>Int):Int ={
    if (x<1) 0
    else{
      val y = f(x)
      x+add_fth(y,f)
    }
  }
  def minus_three(x:Int):Int ={
    return x-3
  }

  /*Write a more general version of the sum_f and combine functions from class
  called apply_combine that applies a function f(taken as a parameter) to the integers
  from 1 to x(taken as a parameter), then combines those values using another function g(taken as a parameter).
  So apply_combine takes in three parameters: a function f that takes in an Int and returns an Int;
  a function g that takes in two Ints and returns an Int; and an Int x .
  It then returns the result of using the function g to combine the values gained by applying f to 1, 2, …, x.
  For example, if I define
  def add(x:Int, y:Int) :Int = x+y
  def square(x:Int):Int = x*x
  then
  apply_combine(square, add, 4)
  would return 30=16+9+4+1
  And if I define
  def mult(x:Int, y:Int) :Int = x*y
       def identity(x:Int) = x
  then
  apply_combine(identity, mult, 4)
  would return 24
  */

  def apply_combine(f1: Int => Int, f2: (Int,Int)=> Int, x: Int):Int = {
    if (x==1){
      f1(x)
    }else{
      f2(f1(x),apply_combine(f1,f2,x-1))
    }
  }
  def add (x:Int, y:Int):Int = {
    x+y
  }
  def square (x:Int):Int = {
    x*x
  }

  def mult(x: Int, y: Int): Int = x * y
  def identity(x: Int) = x
  def b = 20
  println(is_prime(2)) //true
  println(is_prime(20)) //false
  println(is_prime(47)) //true
  println(add_fth(9,minus_three)) //18
  println(apply_combine(identity, mult, 4)) //24
  println(apply_combine(square, add, 4)) //30

}

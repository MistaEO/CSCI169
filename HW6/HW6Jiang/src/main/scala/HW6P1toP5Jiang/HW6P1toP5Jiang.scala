package HW6P1toP5Jiang

object main extends App{
/*Write a function reduce that takes in two parameters:
a function f that takes in two Ints and returns an Int, and a list xs of Ints.
You should use the function f to combine all of the elements of the list.
For instance, if I have a list and a function as follows:

               def ls = 7::2::5::1::Nil

               def add(x:Int, y:Int) = x+y

       then reduce(add, ls) would return 7+2+5+1= 15.
       Ensure that your function would also do the right thing if called with a function that
       multiplied two inputs.
*/
def reduce(f: (Int, Int) => Int, xs: List[Int]):Int = {
  if (xs.isEmpty) 0
  else if(xs.tail.isEmpty) xs.head
  else reduce(f, f(xs.head,xs.tail.head)::xs.tail.tail)
}

/*Write a function in Scala whose parameters are:
two lists of Ints, xs and ys, and a function f that takes in two Ints and returns an Int.
The function should return a new list whose elements are obtained by applying f to the corresponding elements of xs and ys.
Test your function using anonymous functions corresponding to f(x, y) = x+y and f(x, y) = x*x+y.
For example, if xs was the list 3, 8, 1, 5 and ys was 12, 6, 23, 1, 8, 4 and the f used was f(x, y) = x+y,
our result list would be 15, 14, 24, 6.  Note that if one list is longer than the other,
the extra elements are not included in the result list.  You may NOT use a helper function with extra parameters.
*/
  def merge(xs:List[Int], ys:List[Int], f: (Int,Int)=>Int):List[Int] = {
    if (xs.isEmpty || ys.isEmpty) Nil
    else f(xs.head, ys.head)::merge(xs.tail,ys.tail,f)
  }
/*Write a curried version of your reduce function from problem 1.
Your function should take in a function and return another function which takes in a list of Ints and returns an Int.
You may return an anonymous function or a named one.
*/

def reduce_curry(f:(Int,Int)=>Int):List[Int]=>Int ={
  def inner(xs:List[Int]):Int = {
    if (xs.isEmpty) 0
    else if(xs.tail.isEmpty) xs.head
    else f(xs.head, inner(xs.tail))
  }
  inner
}
/* Write a curried version of your function from problem 2,
which takes in the function f and returns another function that takes in two lists of Ints and returns a list of Ints.
You may return an anonymous function or a named one.
You may NOT use a helper function with extra parameters.
*/

def merge_curry(f:(Int,Int)=>Int):(List[Int],List[Int])=>List[Int]= {
  def inner(xs:List[Int],ys:List[Int]):List[Int] = {
    if (xs.isEmpty || ys.isEmpty) Nil
    else f(xs.head,ys.head)::inner(xs.tail,ys.tail)
  }
  inner
}
/*Write a curried version of your function from problem 4.
In this part, you will curry the inner (returned) function from problem 4,
so that the inner function takes in a list of Ints,
and returns a function that takes in a second list of ints and returns a third list of Ints.
You may return an anonymous function or a named one.
You may NOT use a helper function with extra parameters.
*/

  def merge_curry_curry(f:(Int,Int)=>Int)= {
    def inner(xs:List[Int]):List[Int]=>List[Int] = {
      (ys:List[Int])=>{
        if(xs.isEmpty || ys.isEmpty)Nil
        else f(xs.head,ys.head)::inner(xs.tail)(ys.tail)
      }
    }
    inner
  }


  def ls = 7::2::5::1::Nil
  def m1 = 7::2::5::1::Nil
  def m2 = 2::3::4::1::6::1::Nil
  //m1 and m2 merged should be 9,5,9,2
  def l1 = Nil
  def l2 = 2::3::4::Nil
  def add(x:Int, y:Int) = x+y
  def mult(x:Int, y:Int) = x*y
  println(reduce(add,ls)) //15
  println(reduce(mult,ls)) //70
  println(reduce(add,l1))//0
  def m3 = merge(m1,m2, (x, y) => x+y) // 9,5,9,2
  println(m3)
  def m4 = merge(m1,m2, (x,y) => x*y) //14,6,20,1
  println(m4)
  def m5 = merge(l1,l2, (x,y) => x*y) //empty list
  println(m5)
  def curry_reduce_test_1 = reduce_curry(add) //15
  println(curry_reduce_test_1(m1))
  def curry_reduce_test_2 = reduce_curry(mult)
  println(curry_reduce_test_2(m1)) //70
  def merge_curry_test_1 = merge_curry(add)
  println(merge_curry_test_1(m1,m2)) // 9,5,9,2
  println(merge_curry_curry(add)(m1)(m2)) //9,5,9,2




}

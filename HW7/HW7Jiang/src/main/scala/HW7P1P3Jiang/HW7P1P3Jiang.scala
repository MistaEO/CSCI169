package HW7P1P3Jiang

object Main extends App{
  /*Take a look at problems 3 and 5 from HW 6.
  Do these again, but this time you MUST return an anonymous function (no named inner function).
  If you used an anonymous function for HW 6, just resubmit your work.
  You may NOT use a helper function with extra parameters.
  */
  def reduce_curry_anonymous(f:(Int,Int)=>Int):List[Int]=>Int ={
    (xs:List[Int])=>{
      if (xs.isEmpty) 0
      else if(xs.tail.isEmpty) xs.head
      else f(xs.head, reduce_curry_anonymous(f)(xs.tail))
    }
  }

  def merge_curry_curry_anonymous(f:(Int,Int)=>Int):List[Int]=>List[Int]=>List[Int]={
    (xs:List[Int])=>{
      (ys:List[Int])=>{
        if (xs.isEmpty || ys.isEmpty) Nil
        else f(xs.head,ys.head)::merge_curry_curry_anonymous(f)(xs.tail)(ys.tail)
      }
    }
  }

  /*Write a function def findlast(xs:List[Int], x:Int):Int that returns the index of the last time the element x appears in the list xs.
  Return -1 if the element does not appear in the list.
  For this function, you MUST use pattern matching, and you may NOT use any built-in list functions (isEmpty, head, tail, map, reduce, etc).
  I will give 2 points extra credit if you do it without a helper function.
  */
  def findlast(xs:List[Int], x:Int):Int = xs match {
    case Nil => -1
    case list_front::rest_of_list =>
      val index_tracker = findlast(rest_of_list, x)
      if (index_tracker == -1)
          if (list_front == x) 0
          else -1
      else index_tracker +1
  }

  def ls = 7 :: 2 :: 5 :: 1 :: Nil
  def m1 = 7 :: 2 :: 5 :: 1 :: Nil
  def m2 = 2 :: 3 :: 4 :: 1 :: 6 :: 1 :: Nil
  //m1 and m2 merged should be 9,5,9,2
  def l1 = Nil
  def l2 = 2 :: 3 :: 4 :: Nil
  def add(x: Int, y: Int) = x + y
  def mult(x: Int, y: Int) = x * y
  println(reduce_curry_anonymous(mult)(ls)) //70
  println(merge_curry_curry_anonymous(add)(m1)(m2)) //9,5,9,2
  println(findlast(ls,5)) //2
  println(findlast(m1,1)) //3
  println(findlast(m2,19)) //-1

}

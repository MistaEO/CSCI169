package HW7P1toP3Jiang

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

  class Biguint(num:List[Int]){
    def this(s:String) = this({def convert(s:String):List[Int] = {if(s.isEmpty) Nil else convert(s.tail):::List((s.head-'0'))}; convert(s)})
    }

  
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

}

package HW9P3Jiang

object Main extends App {

  /*Classes (5 points extra credit).  Fill in the class and functions below as described in the comments.
  */

  class Set(f:Int=>Boolean){

    //the function f returns true for elements of the set and false for all other numbers

    def contains(elem: Int): Boolean ={
      f(elem)
    }

    //returns true if elem is in the set and false for all other numbers



    def \/ (t:Set):Set ={
      new Set((x:Int)=>(this contains x) || (t contains x))
    }

    //Returns the union of this set and t.



    def /\ (t:Set):Set ={
      new Set((x:Int)=>(this contains x) && (t contains x))
    }

    //Returns the intersection of this set and t



    def - (t:Set):Set ={
      new Set((x:Int)=>(this contains x) && !(t contains x))
    }

    //Returns the difference of this set and t



    def filter(p:Int=>Boolean):Set ={
      new Set((x:Int) => (this contains x) && p(x))
    }

    // Returns a new set that consists of the elements of s that satisfy the predicate.



    def forall(p:Int=>Boolean):Boolean ={
      def check(x:Int):Boolean = {
        if (x > 1000) true
        else if (p(x) || !(this contains x)) check(x+1)
        else false
      }
      check(-1000)
    }

    //Returns true if the predicate is true for all elements of this set, and false otherwise.

    // In order to make it possible to implement this function,
    // we will consider a predicate true for all integers if it is true for integers from -1000 to 1000.

  }

  //Please name your file for this problem HW9P3Lastname.scala.

  val set1 = new Set((x:Int)=> if (x==2 || x==3 || x==4 || x==5 ||x==6) true else false)
  //set of 2,3,4,5,6
  val set2 = new Set((x:Int)=> if (x==2 || x==3) true else false)
  //set of 2 and 3
  val set3 = new Set((x:Int)=> if (x==5 ||x==6) true else false)
  //set of 5 and 6
  println(set1.contains(2)) //true
  println(set2.contains(1))//false
  val set4 = set2 \/ set3 //unions
  //set of 2 3 5 6
  println(set4.contains(3)) //true
  println(set4.contains(5)) //true
  println(set4.contains(7))//false
  val set5 = set2 /\ set1
  //set of 2 and 3
  println(set5.contains(3)) //true
  println(set5.contains(5)) //false
  val set6 = set1 - set3
  //set of 2 3 4
  println(set6.contains(3)) //true
  println(set6.contains(6)) //false
  def is_even(x:Int):Boolean ={
    x%2==0
  }
  val set7 = set1.filter(is_even)
  //evens in set 1
  println(set7.contains(3)) //false
  println(set7.contains(2)) //true
  val set8 = new Set((x:Int)=> if (x==2 || x==4) true else false)
  println(set8.forall(is_even)) //true
  println(set2.forall(is_even)) //false





}

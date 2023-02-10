/* In this problem, you'll work with the SortedList class from HW3.  
You should modify your SortedList class so that if implements Java's Iterable interface: 
https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.htmlLinks to an external site.
You should also create a main function and/or class that creates a SortedList, adds elements to it, and uses a foreach loop to print out its contents.  
Hint: it may be helpful to know that you can pass an array into the Arrays.stream() method to convert it into a Stream.  Note that Stream inherits from BaseStream. */
public class HW4P2bJiang {
    public static void main(String args[]){
        int arr[] = {2,562,4,6,2,12,8,65,25};
        SortedList testList = new SortedList(arr);
        
        for (Object x: testList){
            System.out.print(x + " ");
        }
          
    }

}

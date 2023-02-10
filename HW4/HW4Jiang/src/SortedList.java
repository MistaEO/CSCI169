import java.util.Iterator;

/*We started on a BinarySearch Class in class on Monday (Code is on Camino).  
In this problem you will make it “more” object-oriented in the following ways:
-Note its name is now SortedList
-You will make a constructor that takes no arguments initializes the member field

-You will add a constructor that takes in an initialized array 

-You will add an insert function that adds a value to the list and maintains its sorted-ness.

-You will add a quicksort function (feel free to use what you wrote #1).

-You will add a print function that prints out the contents in a nice format.
-You will make updates as necessary to the main function so that it still runs and tests your code. 
Up to you if you want to separate it out into a different class.
Please name your file for this problem SortedList.java */


class SortedList implements Iterable<Integer>{
    private int array[];

    public SortedList(){
        array = new int[0];
    }

    public SortedList(int arr[]){
        quicksort(arr, 0, arr.length-1);
        array = arr;
    }
    public int getLength(){
        return array.length;
    }
    public void insert(int element){
        int[] newArray = new int[(array.length)+1];
        for (int i = 0; i < newArray.length -1; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        quicksort(newArray, 0, array.length);
        array = newArray;

    }

    public void print(){
        System.out.print("Array consists of: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public int binsearch(int search){
        int n=array.length;
        int first, last, middle;
        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;
        while( first <= last )
        {
            if ( array[middle] < search )
                first = middle + 1;
            else if ( array[middle] == search )
            {
                return middle;
            }
            else
                last = middle - 1;
            middle = (first + last)/2;
        }
        return -1;
    }
    public int partition(int[] input, int p, int r){
        int pivot = input[r];

        while(p<r){
            while(input[p] < pivot){
                p++;
            }
            while(input[r] > pivot){
                r--;
            }
            if (input[p] == input[r]){
                p++;
            }else if(p<r){
                int temp = input[p];
                input[p] = input[r];
                input[r] = temp;
            }

            }
            return r;
        }
    

    public void quicksort(int[] input, int p, int r){
        if(p<r){
            int j = partition(input, p, r);
            quicksort(input,p,j-1);
            quicksort(input,j+1, r);
        }
    }

    //@Override
    public Iterator<Integer> iterator() {
        return new SortedListIterator(array);
    }
}

class SortedListIterator implements Iterator<Integer>{
    private int array[];
    private int index;

    SortedListIterator(int[] arr){
        array = arr;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Integer next() {
        return array[index++];
    }

}
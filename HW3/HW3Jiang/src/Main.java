import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int c, n, search, array[];
        SortedList emptyTest = new SortedList();
        emptyTest.print();
        emptyTest.insert(2);
        emptyTest.print();


        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " integers");
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        SortedList s = new SortedList(array);
        System.out.println("Enter value to find");
        search = in.nextInt();
        in.close();
        System.out.println("Size before insertion:" + s.getLength());
        s.insert(4);
        System.out.println("Size after insertion:" + s.getLength());
        System.out.println("Inserting 4");
        int spot = s.binsearch(search);
        s.binsearch(search);
        if(spot>=0)
            System.out.println(search + " found at location " + spot + ".");
        else
            System.out.println(search + " is not present in the list.\n");
        s.print();
    }
}
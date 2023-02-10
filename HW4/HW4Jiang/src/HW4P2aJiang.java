

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/*In this problem, you’ll be working with the Food, Fruit, Apple, and Orange classes from HW 3.    
You should modify your Fruit class so that it implements Java’s Comparable interface: 
https://www.javatpoint.com/Comparable-interface-in-collection-frameworkLinks to an external site.
A piece of fruit should be considered greater if its ripe Date is later.
You should also create a main function and/or class that creates an ArrayList of Fruit, prints out its contents in a nice format, sorts it, and prints out its contents again.  Note:  Implementing Comparable means you can use the Java built-in sort function. */
public class HW4P2aJiang {
    public static void main(String args[]){
        ArrayList<Fruit> froots = new ArrayList<Fruit>();
        
        Date d1 = new Date(2000000000);
        Date d2 = new Date(1999999999);
        Date d3 = new Date(5); //earliest
        Date d4 = new Date(2000000005); //latest
        Fruit banan = new Fruit("banana", d3);
        Fruit pom  = new Fruit("pomegranate", d1);
        Fruit mngo = new Fruit("mango", d2);
        Fruit grp = new Fruit("grape", d4);
        froots.add(banan);
        froots.add(pom);
        froots.add(mngo);
        froots.add(grp);

        System.out.print("Here are the fruits before being sorted: ");
        for (int i = 0; i < froots.size(); i++){
            if(i != froots.size()-1){
                System.out.print(froots.get(i).getName() + " Dated for: ");
                System.out.print(froots.get(i).getRipe()+ ", ");
            }else{
                System.out.print(froots.get(i).getName() + "Dated for: ");
                System.out.println(froots.get(i).getRipe());
            }
            
        }

        Collections.sort(froots);
        System.out.print("Here are the fruits after being sorted: ");
        for (int i = 0; i < froots.size(); i++){
            if(i != froots.size()-1){
                System.out.print(froots.get(i).getName() + " Dated for: ");
                System.out.print(froots.get(i).getRipe()+ ", ");
            }else{
                System.out.print(froots.get(i).getName() + "Dated for: ");
                System.out.println(froots.get(i).getRipe());
            }
            
        }

    }
}

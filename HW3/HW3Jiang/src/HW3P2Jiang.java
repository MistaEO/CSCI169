import java.util.Date;
public class HW3P2Jiang {
/*In this problem, you will explore inheritance.  
Implement the classes Food, Fruit, Orange, Apple, Seafood, Shrimp, and Prawn as represented in the class diagram here.

That is, Fruit inherits from Food, Orange inherits from Fruit, etc.  
In addition to what is shown, you may add a getter method for the name field in Food.

The first area in a class’s box is its name, the second is its member data fields and their types, and the third is its member methods.  
So you can tell what the methods should do, I’ve provided a main function and its output.  Download a main function and its output. 
Note that the name field of any object of a given type should be initialized to match its class name; 
ex: Apple objects' names should be initialized to “apple”.

 */
    public static void main(String[] args){
        Date d = new Date(2000000000);
        Food gum = new Food("gum");
        Food las = new Food("lasagna");
        Fruit pom  = new Fruit("pomegranate",d);
        Fruit app = new Apple(d);
        Orange o = new Orange(d);
        Shrimp sh = new Shrimp();
        Seafood p = new Prawn();
        Seafood l = new Seafood("lobster");
        sh.prepare();
        app.prepare();
        pom.prepare();
        o.prepare();
        gum.prepare();
        p.prepare();
        l.prepare();
        las.prepare();
        las = app;
        las.prepare();
        o.ripeTime();
        pom.ripeTime();

    }
}

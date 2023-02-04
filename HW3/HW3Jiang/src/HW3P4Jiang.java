import java.util.ArrayList;

/*You’ll write a function which takes as input an ArrayList  of Strings and Integers, 
and returns an ArrayList of objects from Problem 2 (to make it simpler,
 we’ll restrict it to Food, Fruit, Apple, and Orange objects), and a sensible main that tests it.    
 The starting ArrayList should be formatted as follows:  the name of the type of the next object, 
 followed by parameter(s) that should be sent as input to the class’ constructor 

 (however if you should send a Date as input, 
 you will be given either the string “now” if you should use Date’s constructor that takes no parameters, 
 or an Integer if you should use the constructor that takes a long).  
 So for instance, the input ArrayList could contain the following:  
 “Food”, 
 “Orange”, 
 “Fruit”, “Papaya”, Integer(3932728), 
 “Apple”, “now”, 
 “Food”, “sandwich”, 
 and the resulting ArrayList would have 5 objects in it, of type Food, Orange, Fruit, Apple, and Food.

You may wish to refer to the documentation for the Date class:  https://docs.oracle.com/javase/7/docs/api/java/util/Date.html */
import java.util.Date;
public class HW3P4Jiang {
    
    public static ArrayList<Object> foodCreator(ArrayList<Object> foods){
        ArrayList<Object> newFoods = new ArrayList<Object>();
        ArrayList<Object> existingFoods = new ArrayList<Object>();
        existingFoods.add("Food");
        existingFoods.add("Fruit");
        existingFoods.add("Apple");
        existingFoods.add("Orange");
        for (int i = 0; i < foods.size(); i++){
            Object currentFood = foods.get(i);
            if (currentFood == "Food"){
                if(existingFoods.contains(foods.get(i+1))){
                    newFoods.add(new Food());
                }else{
                    Object name = foods.get(i+1);
                    newFoods.add(new Food(name.toString()));
                    i++;
                }
            }else if(currentFood == "Fruit"){
                if(existingFoods.contains(foods.get(i+1))){
                    newFoods.add(new Fruit());
                }else{
                    Object name = foods.get(i+1);
                    Date date;
                    if(foods.get(i+1+1) == "now"){
                        date = new Date();
                    }else{
                        date = new Date(((int)foods.get(i+2)));
                    }
                    newFoods.add(new Fruit(name.toString(), date));
                    i += 2;
                }
            }else if(currentFood == "Apple"){
                if(existingFoods.contains(foods.get(i+1))){
                    newFoods.add(new Apple());
                }else{
                    Date date;
                    if(foods.get(i+1) == "now"){
                        date = new Date();
                    }else{
                        date = new Date(((int)foods.get(i+1)));
                    }
                    newFoods.add(new Apple(date));
                    i++;
                }
            }else{
                if(existingFoods.contains(foods.get(i+1))){
                    newFoods.add(new Orange());
                }else{
                    Date date;
                    if(foods.get(i+1) == "now"){
                        date = new Date();
                    }else{
                        date = new Date(((int)foods.get(i+1)));
                    }
                    newFoods.add(new Orange(date));
                    i++;
                }
            }
            
        }
        return newFoods;
    }

    public static void main(String args[]){
        ArrayList<Object> foods = new ArrayList<Object>();
        foods.add("Food");
        foods.add("Orange");
        foods.add("Fruit");
        foods.add("Papaya");
        foods.add(3932728);
        foods.add("Apple");
        foods.add("now");
        foods.add("Food");
        foods.add("sandwich");

        ArrayList<Object> createdFoods = foodCreator(foods);
        for (int i = 0; i < createdFoods.size(); i++){
            Object f = createdFoods.get(i);
            System.out.print(f.getClass() + " ");
        }
    }

}

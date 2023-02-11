/*In this problem, you’ll be working with the Food, Fruit, Apple, and Orange classes from HW 3. Translate these classes into C++, and add the following two classes:

Vegetable, which inherits from Food (Data:  expiration:Date, Methods: Vegetable(), Vegetable(n:String, e:Date), expireTime():Date)

Tomato, which inherits from Vegetable and Fruit (Data: None, Methods: Tomato(), Tomato(e:Date, r:Date, n:String))

Add print statements to all constructors that show which class’s constructor has been called.  
You should ensure that the Food constructor is called only once when a Tomato object is created.

Also include a main function that creates a Tomato object and calls all of its member functions.

Note that C++ doesn't have a built-in Date type like Java, so instead you may use whatever type you like to represent the date; you can use functionality from ctime, 
create your own Date type, etc.

For this problem, submit your Food.h, Fruit.h, Apple.h, Orange.h, Vegetable.h, and Tomato.h files 
(please write the entire class in the header file to control the explosion of files) and your main file.  
The main file should be named HW4P3Lastname.cpp  where Lastname is your last name.*/

#include "Food.h"
#include "Fruit.h"
#include "Apple.h"
#include "Orange.h"
#include "Vegetable.h"
#include "Tomato.h"

int main(){
    time_t ripeTime = 100;
    time_t expirationTime = 200;
    Food pom("pom");
    pom.prepare();
    Fruit cucumba("cucumba", ripeTime);
    cucumba.prepare();
    Orange orng(ripeTime);
    orng.prepare();
    Vegetable bc("bok choy", expirationTime);
    bc.prepare();
    std::cout << bc.expireTime() << std::endl;
    Tomato tmto("T",ripeTime,expirationTime);
    tmto.prepare();
    std::cout << tmto.getRipe() << std::endl;
    std::cout << tmto.expireTime() << std::endl;
    
    return 0;
}
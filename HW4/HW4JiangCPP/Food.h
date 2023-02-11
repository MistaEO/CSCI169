#include <iostream>
#include <string>
#ifndef FOOD_H
#define FOOD_H


class Food{
    public:

    Food(){
        name = "";
        std::cout << "Food created" << std::endl;
    }

    Food(std::string n){
        name = n;
        std::cout << "Food created" << std::endl;

    }
    std::string getName(){
        return name;
    }

    void prepare(){
        std::cout << "Prepare the " + name << std::endl;
}
    protected:
        std::string name;
};



#endif //FOOD_H
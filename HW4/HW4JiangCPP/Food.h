#include <iostream>
#include <string>
#ifndef FOOD_H
#define FOOD_H


class Food{
    public:

    Food(){
        name = "";
    }

    Food(std::string n){
        name = n;
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
#include <iostream>
#include <string>
#include <ctime>
#include "Food.h"
#ifndef FRUIT_H
#define FRUIT_H

class Fruit: public virtual Food{
    protected:
    std::time_t ripe;
    public:
    Fruit(){
        name = "Fruit";
        ripe = 0;
        std::cout << "Fruit created" << std::endl;
    }
    Fruit(std::string n, std::time_t r){
        name = n;
        ripe = r;
        std::cout << "Fruit created" << std::endl;
    }
    void ripeTime(){
        std::cout << "You can eat it on " + ripe << std::endl;
    }
    std::time_t getRipe(){
        return ripe;
    }
    
    


};


#endif 
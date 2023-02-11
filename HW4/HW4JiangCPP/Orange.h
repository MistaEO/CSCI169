#ifndef ORANGE_H
#define ORANGE_H
#include "Fruit.h"

class Orange: public virtual Fruit{
    public:
    Orange(){
        name = "Orange";
        ripe = 0;
        std::cout << "Orange created" << std::endl;
    }
    Orange(std::time_t r){
        name = "Orange";
        ripe = r;
        std::cout << "Orange created" << std::endl;
    }

    void prepare(){
        std::cout << "Peel the " + name << std::endl;
    }
};

#endif
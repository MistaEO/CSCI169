#ifndef TOMATO_H
#define TOMATO_H
#include "Vegetable.h"
#include "Fruit.h"

class Tomato: public virtual Vegetable, public virtual Fruit{
    public:
    Tomato(){
        name = "Tomato";
        ripe = 0;
        expiration = 0;
        std::cout << "Tomato created" << std::endl;
    }
    Tomato(std::string n, std::time_t r, std::time_t e){
        name = n;
        ripe = r;
        expiration = e;
        std::cout << "Tomato created" << std::endl;
    }
};

#endif
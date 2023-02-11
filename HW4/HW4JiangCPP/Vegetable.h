#ifndef VEGETABLE_H
#define VEGETABLE_H
#include "Food.h"

class Vegetable: public virtual Food{
    protected:
    std::time_t expiration;
    public:
    Vegetable(){
        name = "vegetable";
        expiration = 0;
        std::cout << "Vegetable created" << std::endl;
    }
    Vegetable(std::string n, std::time_t e){
        name = n;
        expiration = e;
        std::cout << "Vegetable created" << std::endl;
    }

    std::time_t expireTime(){
        return expiration;
    }
};


#endif
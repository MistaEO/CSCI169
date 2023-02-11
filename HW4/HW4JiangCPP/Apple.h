#ifndef APPLE_H
#define APPLE_H
#include "Fruit.h"

class Apple: public virtual Fruit{
    public:
    Apple(){
        name = "apple";
        ripe = 0;
        std::cout << "Apple created" << std::endl;
    }
    Apple(std::time_t r){
        name = "apple";
        ripe = r;
        std::cout << "Apple created" << std::endl;
    }

    void prepare(){
        std::cout << "Core the " + name << std::endl;
    }
};

#endif 
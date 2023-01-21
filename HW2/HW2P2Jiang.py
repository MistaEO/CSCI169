x = 10
c=10
#x and c are global variables, both with value 10
def spam ():
    c=14
    #creates a local variable c with value 14, local to spam
    bbeans = 15
    #creates a local variable bbeans with value 15, local to spam
    def inner ():
        #function nested within spam
        c="funtimes!"
        #creates a local variable c with value "funtimes", local to inner
        def innerinner():
            #function nested within inner, which is nested within spam
            global a
            a=54
            #creates a global a variable with value 54
            nonlocal c
            c=54
            #creates a new object for nonlocal c to reference, with the nonlocal c being the c defined in inner
            nonlocal bbeans
            bbeans=68
            #creates a new object for nonlocal bbeans to reference, with the nonlocal bbeans being the bbeans defined in spam
        innerinner()
        #calls innerinner
        #creates globl a with value of 54, c now hs value of 54, and bbeans has value of 68
        print(c)
        #should print 54 because of nonlocal modification
        return bbeans
        #return 68
    print(x)
    #print 10, global x was unchanged
    print(c)
    #print 14, global c was unchanged
    return inner()
    #calls inner and returns it
print(spam())
#prints 10, 14, 54, then 68, because spam prints x and c before it calls inner

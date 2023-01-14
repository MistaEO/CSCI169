"""Write a function in python

def fun(x, y):

that if called with

fun(1, 2)

returns 3

and if called with

fun("hi", "there")

returns “hithere”"""


def fun(x, y):
    print (x + y)

def main():
    fun(1,5) #int test case
    fun(2.0, 1.5) #float test case
    fun("hi", "there") #string test case
    print("Hello World!")

if __name__ == "__main__":
    main()
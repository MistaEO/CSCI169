"""Write a function in python

def fun(x, y):

that if called with

fun(1, 2)

returns 3

and if called with

fun("hi", "there")

returns “hithere”"""


def fun(x, y):
    return (x + y)

def main():
    print(fun(1,5)) #int test case
    print(fun(2.0, 1.5)) #float test case
    print(fun("hi", "there")) #string test case

if __name__ == "__main__":
    main()
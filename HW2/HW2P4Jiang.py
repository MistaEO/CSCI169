"""a.  Write a line of code that creates a new list by taking a slice of an existing list of length 10 in the following way.  
It will take every third element of the list, starting with the second element.

b.  Write a list comprehension that creates a list containing only the items in the original list of type int, 
but with each int from the original list converted into a string."""

def main():
    test_list=[1,2,3,4,5,6,7,8,9,10]
    step_list = test_list[2::3]
    #part a
    print(step_list)

    #part b
    int_list=[1,"two","three",4,"five",[1,2,3]]
    str_list = [str(x) for x in int_list if isinstance(x,int)]
    print(str_list)
    print(type(str_list[0]))

if __name__ == "__main__":
    main()
def foo(x):
    x[0]=55
    #modify index 0 of list to 55
    x=11
    #creates a new object that x will now reference
    return x
def bar(xs):
    xs=[1, 2, 3]
    #creates a new list [1,2,3] that xs will now reference
    xs[0]="squeegee"
    #modify index 0 of list to "squeegee"
    return xs
ys=[[1, 2, 3], 2, 3]
print(foo(ys))
#will modify list into 55,2,3 before creating a new object 11 that ys references, prints 11
print(ys)
#prints 55,2,3 since x=11 within foo does not maintain value reassignment outside the function
print(bar(ys))
#prints squeegee,2,3 because bar modifies the xs local variable that we defined within bar
print(ys)
#prints 55,2,3 since we made xs reference an entirely new list in bar, thus the inputted ys is not modified in place
zs=range(0, 10)
print(foo(zs))
print(zs)
print(bar(zs))
print(zs)
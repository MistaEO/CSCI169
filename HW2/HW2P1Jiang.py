def scope_test():
    def do_local():
         spam = "local spam"
         #creates a spam variable that is local to do_local
    def do_nonlocal():
        nonlocal spam
        spam = "nonlocal spam"
        #a spam variable that is not local to do_nonlocal will reference a new object that has the value "nonlocal spam"
    def do_global():
        global spam
        spam = "global spam"
        #global spam variable will reference a new object that has the value "global spam"
    spam = "test spam"
    do_local()
    print("After local assignment:", spam)
    #will print test spam because do_local does not do anything to the spam we just defined above, do_local only creates a spam variable that is
    #local to do_local
    do_nonlocal()
    print("After nonlocal assignment:", spam)
    #prints nonlocal spam because do_nonlocal creates a new object for spam to reference
    do_global()
    print("After global assignment:", spam)
    #prints nonlocal spam because do_global creates a global variable named "spam" that references "global spam"
scope_test()
print("In global scope:", spam)
#prints global spam because a global spam variable was created in do_global
"""Write a function in python

def report(xs):

that generates a report about the residents of an apartment building in the following way.  
It takes in a list formatted so that each apartment number is followed by the names of everyone who lives in that apartment.  
It should return the average number of people who live in an apartment, and the largest number of people who live in an apartment, as a list. 
For instance, 

report([100, “Jill Johnson”, “Billy Ray Cyrus”, 110, “Shweta Agarwal”, 120, “Miguel Rosas”, “Elena Rosas”, “Mateo Rosas”, 200, "Jason Chan", 210, "Rosalia Torres"])

returns 

[1.6, 3]

Your function should work for any input list formatted similarly to the example."""

def report(xs):
    overall_people_count = 0
    apartment_people_count = 0
    apartment_count = 0
    people_peak = 0
    for x in xs:
        if (isinstance(x, int)):
            apartment_count += 1
            apartment_people_count = 0
        else:
            overall_people_count += 1
            apartment_people_count +=  1
            if (apartment_people_count > people_peak):
                people_peak = apartment_people_count

    statistics = []
    statistics.append(overall_people_count/apartment_count)
    statistics.append(people_peak)
    print(statistics)

def main():
    report([100, "Jill Johnson", "Billy Ray Cyrus", 110, "Shweta Agarwal", 120, "Miguel Rosas", "Elena Rosas", "Mateo Rosas", 200, "Jason Chan", 210, "Rosalia Torres"]) #base case

if __name__ == "__main__":
    main()

"""Translate C++ Quicksort into Python"""


def partition(input, p, r):
    pivot = input[r]
    while (p < r):
        while (input[p] < pivot):
            p += 1
        while (input[r] > pivot):
            r -= 1
        if (input[p] == input[r]):
            p += 1
        elif (p < r):
            temp = input[p]
            input[p] = input[r]
            input[r] = temp
        
    return r

def quicksort(input, p ,r):
    if (p < r):
        j = partition(input, p, r)
        quicksort(input, p, j-1)
        quicksort(input, j+1, r)

def main():
    input = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
    print(input)
    quicksort(input, 0 ,9)
    print (input)

if __name__ == "__main__":
    main()

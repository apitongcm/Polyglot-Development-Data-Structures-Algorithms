#Dictionary 
nums = {
    1:"one",
    2:"two",
    3:"three",
}

print(1 in nums)
#returns True

print("three" in nums)
#returns False

pairs = {
    1: "apples",
    "oranges":[2, 3, 4],
    True:False,
    12:"True",
}

print(pairs.get("oranges"))

print(pairs.get(7,"not found"))

fib = {
    1:1,
    2:1,
    3:2,
    4:3,
}

print(fib.get(4,0) + fib.get(8,20))
#(3+20) = 23R

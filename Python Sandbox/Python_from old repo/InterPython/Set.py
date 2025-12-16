#Set 
num_set = {1,2,3,4,5}
print(3 in  num_set)

#add element
num_set.add(-12)

#delete element
num_set.remove(2)

print(num_set)

#check number of element inside the set.
print(len(num_set))

first = {1,2,3,4,5,6}
second = {4,5,6,7,8,9}

union = first|second
intrsct = first&second
diffF = first-second
diffS = second-first
symdif = first^second

print(symdif)

#List comprehensions - quickly creating lists whose contents obey a rule.
cubes = [i**3 for i in range(5)]
print(cubes)

#other example 
even = [i**2 for i in range(10) if i**2 % 2 == 0]
print(even)

myNum = (55,44,33,22)
print(max(min(myNum[:2]),abs(-42)))
#the third argument is Step.
numbers = list(range(5,20,2))
print(numbers)

#ranges works with loops
#for el in range(10):
#    print("Konnichiwa")

#list slices
squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[1:4])
print(squares[:5])
print(squares[5:])
print(squares[2:9:2])

#range 
for i in range(10):
    if not i%2 == 0: 
        print(i+1)

#x[0] = 9 then x[2] = 4 thus ans = 13
x = [6,4,2,9]
x = x[::-1]
print(x[0] + x[2])


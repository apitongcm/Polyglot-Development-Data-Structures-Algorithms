#yield statement is used to define GENERATOR, replacing return of a function to provide a 
#results to its caller without destroying local variables. 

def countdown():
    i = 5
    while i > 0: 
        yield i
        i -= 1

for i in countdown():
    print("number: ", i)


#Generators dont have memory restrictions of lists. They can be infinite.

def numbers(x):
    for i in range(x):
        if i % 2 == 0:
            yield i

print(list(numbers(11)))

def make_word(): 
    word = ""
    for mychar in "spam":
        word += mychar
        yield word

print(list(make_word()))
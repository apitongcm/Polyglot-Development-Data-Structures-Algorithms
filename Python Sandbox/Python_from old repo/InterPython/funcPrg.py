#functional programming function inside function (Higher-order functions)

#function takes another function as its argument and call it twice inside its body.
def apply_twice(func,arg):
    return func(func(arg))

def add_five(x):
    return x + 5

print(apply_twice(add_five,5))
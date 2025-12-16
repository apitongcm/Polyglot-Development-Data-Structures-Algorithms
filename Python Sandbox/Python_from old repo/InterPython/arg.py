#*arg  - varying numbers of arguments. 
#enable you to pass an arbitrary number of arguments to that function. (truple)

def tryfunc(named_arg, *testing):
    print(named_arg)
    print(testing)

tryfunc("Hello", "How", "Are", "you")

#*kwargs - allows you to handle named arguments that you have not defined in advance. (dictionary)

def myfunc(x, y=7, *args, **kwargs):
    print(kwargs)

myfunc(2,3,4,5,6, a=7, b=8)

#other example 
def hisfunc(**kwargs):
    print(kwargs["zero"])

hisfunc(a=0, hello=3, zero=9)
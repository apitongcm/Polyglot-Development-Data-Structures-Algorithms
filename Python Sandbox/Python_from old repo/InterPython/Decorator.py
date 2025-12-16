#Decorator - modify functions using other functions. 
#(extend the functionality of functions that you don't want to modify)

def decor(func):
    def wrap():
        print("=========")
        func()
        print("=========")
    return wrap

def print_text(): 
    print("Hello World")

decorated = decor(print_text)
decorated()

# Wrap function will print a string, then call func() "print_text" and print another string.

@decor
def print_word():
    print("Konnichiwa!")

print_word()

#my_dec --> "my_func = my_dec(my_func)"
#Lambdas - passing simple function as an argument
def my_func(f,arg):
    return f(arg)

print(my_func(lambda x: 2+x+x, 5))

a = (lambda x:x*(x+1))(6)
print(a)

#OTHER SAMPLES 
num = [1,2,3,4,5,6,7,8]

res = list(filter(lambda x: x%2 == 0, num))
print(res)
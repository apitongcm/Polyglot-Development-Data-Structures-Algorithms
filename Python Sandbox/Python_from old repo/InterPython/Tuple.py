words = ("Hello", "Konnichiwa", "Jaane", "Arigato", "Doumo")

print(words[2])

#Trying to reassign value in tuple causes error.!! like example below
#words[2] = "Love"

numbers = (1,2,3,4,5,6,7,8,9)
a,b,*c,d = numbers
print(a)
print(b)
print(c)
print(d)
#String have a format() function, enables values to be embedded in it, using PLACEHOLDERS. 
num = [2,0,1]
msg = "Numbers: {0} {1} {2}".format(num[0],num[1],num[2])
print(msg)

str="{c}, {b}, {a}".format(a=5, b=9, c=7)
print(str)
arr = ["swan", "chicken", "hawk", "eagle"]
print(", ".join(arr))
print("spam, eggs, hams".split(", "))
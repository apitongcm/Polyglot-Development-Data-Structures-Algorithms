text = input()
dict = {}

cnt = list(text)

for el in cnt:
    
    if not el in dict:
        dict[el] = 1
    else:
        dict[el] += 1
    
print(dict)    


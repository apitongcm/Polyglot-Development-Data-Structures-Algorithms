#map 

salaries = [2000, 1800, 3100, 4400, 1500]
bonus = int(input())

result = list(map(lambda x: x+bonus, salaries))

print(result)

#filters
nums = [11, 22, 33, 44, 55]
res = list(filter(lambda x: x%2 == 0, nums))
print(res)  
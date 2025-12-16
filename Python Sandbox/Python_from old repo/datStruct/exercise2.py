import math

data = { 
    "100-90": 25,
    "42-01": 48,
    "55-09": 12,
    "128-64": 71 
}

age = int(input())

reg_profit = 0
adj_profit = 0

print(data)
for customer in data: 
        tar_age = data[customer] 
        if tar_age < 18: 
            reg_profit = reg_profit + 5 
        else:
            reg_profit = reg_profit + 20

        if tar_age < age: 
            adj_profit = adj_profit + 5
        else:
            adj_profit = adj_profit + 20


print(reg_profit)
print(adj_profit)
rev_growth = ((adj_profit - reg_profit)/ reg_profit) * 100
print(math.floor(rev_growth))

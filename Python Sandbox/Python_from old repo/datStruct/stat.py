import math 

players = [180, 172, 178, 185, 190, 195, 192, 200, 210, 190]

sum = 0 
for num in players: 
     sum = sum + num

mean = (sum/len(players))
new_sum = 0 

for pl_variance in players:
    new_sum = new_sum + ((mean - pl_variance) **2)

variance = new_sum / len(players)
std = math.floor(math.sqrt(variance))

cnt = 0
for player in players: 
    if (player > (mean - std)):
            if player < (mean + std):
                cnt = cnt + 1


print(cnt)
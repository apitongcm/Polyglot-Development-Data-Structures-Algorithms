weight = float(input())
height = float(input())

BmiVal = weight / (height * height)

if BmiVal < 18.5: 
    print("Underweight")
elif BmiVal > 18.5 and BmiVal < 25:
    print("Normal")
elif BmiVal > 25 and BmiVal <  30: 
    print("Overweight")
else: 
    print("Obesity")
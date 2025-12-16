#AllaboutPhysics
#Temperature,Force ,Work & Energy
#CodeAcad activity
#apitongCM-

train_mass = 22680
train_acceleration = 10
train_distance = 100

bomb_mass = 1

def f_to_c(f_temp):
 c_temp = ((f_temp) - 32) * (5/9)
 return(c_temp)

def c_to_f(c_temp):
  f_temp = ((c_temp) * 9/5)  + 32
  return(f_temp)

def get_force(mass,acceleration):
   return mass*acceleration

def get_energy(mass,c=3*10**8):
  return mass*(c**2)

def get_work(force, distance):
   return train_force*distance






f100_in_celsius = f_to_c(100)
print(f100_in_celsius)

c0_in_fahrenheit = c_to_f(0)
print(c0_in_fahrenheit)

train_force= get_force(train_mass,train_acceleration)
print(train_force)
print("The GE train supplies " + str(train_force) + " Newtons of force.")

bomb_energy = get_energy(bomb_mass)
print("A 1kg bomb supplies " + str(bomb_energy) + " Joules")

train_work = get_work(train_force,train_distance)
print ("The GE train does " + str(train_work) + " Joules of work over " + str(train_distance) + " meters.")


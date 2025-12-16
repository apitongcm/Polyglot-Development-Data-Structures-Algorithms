class PartyAnimal: 
    x = 0
    name = ''
    #Default Constructor used to initializing the object's state.
    #It will be called twice (q,m)
    def __init__(self, nam):
        self.name = nam 
        print(self.name,'constructed')
    def party(self):
        self.x = self.x + 1
        print(self.name,'party count',self.x)
    
q = PartyAnimal('Quincy')
m = PartyAnimal('Miya')

q.party()
m.party()
q.party()
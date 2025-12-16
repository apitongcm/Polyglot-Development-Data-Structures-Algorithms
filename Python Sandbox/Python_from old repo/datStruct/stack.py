#sample in creating a Stack (data structure)
class Stack: 

    #create a empty list
    def __init__(self):
        self.items = []

    #what should be return if list is empty
    def is_empty(self):
        return self.items == []
    
    #how to add item to your list
    def add_item(self, item):
        return self.items.insert(0,item)
    
    #how to remove item to your list
    def remove_item(self):
        return self.items.pop(0)
    
    #print entire list
    def print_stack(self):
        print(self.items)

mylist = Stack()

mylist.add_item('hello')
mylist.add_item('world')
mylist.remove_item()
mylist.add_item('galaxy')
mylist.print_stack()
#exercise about data structure

class myExprss:

    def __init__(self):
        self.elements = []
    def is_empty(self):
        return self.elements == []
    def add_element(self, element):
        return self.elements.insert(0,element)
    def remove_element(self):
        return self.elements.pop(0)
    def print_list(self):
        print(self.elements)


mylist = myExprss()
def balanced(expression):
    

    for item in expression: 
        if item == "(":
            mylist.add_element('1')
        if item == ")":
            if "(" in mylist:
                mylist.remove_element()
            else:
                return False
    if not mylist():
        return True
    
    return False    

    

    


print(balanced(input()))
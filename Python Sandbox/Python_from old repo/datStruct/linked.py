#sample of linked-list 

#creating a class Node for creating template for each new data and new next. 
class Node: 
    def __init__(self, data, next):
        self.data = data
        self.next = next


class linkedList:

    #define that the first value should be None (null value)
    def __init__(self):
        self.head = None

    #this function adds the data in the leftmost part of the list    
    def  add_at_front(self, data):
        self.head = Node(data,self.head)

    #this function adds the data in the rightmost part of the list 
    def add_at_end(self,data):
        
        if not self.head:
            self.head = Node(data, None)
            return 
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = Node(data, None)

    def get_last_node(self): 
        n = self.head
        while(n.next != None):
            n = n.next
        return n.data

    def is_empty(self):
        return self.head == None

    def print_list(self):
        n = self.head 
        while n != None:
            print(n.data, end = " => ")
            n = n.next
        print()

sample = linkedList()
sample.add_at_front(2)
sample.add_at_end('how')
sample.add_at_front('are')
sample.add_at_front('you')

sample.print_list()
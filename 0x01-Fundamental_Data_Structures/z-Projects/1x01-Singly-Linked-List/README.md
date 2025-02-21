# Singly Linked List Implementation


## How did you study this the first time?

1. I initially studied the attributes of the singly linked list class, by reading the code and the text.
2. I implemented the addFirst method off-hand by reading the text.
   1. I tested it with the `Main` class.
3. I implemented the addLast method off-hand.


## How did you study this subsequently after the first time?

1. I realised that the main focus is the elemental part of the data structure. We are focusing on the elements.
2. Each element is stored in a class called node. The node, aside the element, holds a reference to the next node.
3. As we are storing elements, things that put the DSA together are changing.
3. **Adding New Element at the front of the list**: We need to create a new element. At creation, make the element of the new node that point to the next element point to the head. Then make the new element the head. Two things are involved:
   + The list is empty of nodes, or
   + The list contain at least a node already
4. 

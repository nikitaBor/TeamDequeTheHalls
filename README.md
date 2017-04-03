# TeamDequeTheHalls
## Method Choices
We chose to implement add(), offer(), element(), peek(), remove(), and poll(), size(), and isEmpty() because they are basic methods of Queues.
Each of these methods, besides size() and isEmpty(), function on the _front and _end so that our interface resembles a Queue and a Stack.
We also renamed certain methods whose names we thought were not clearly indicative of the method's function. Methods with "Carefully" return null if the Deque is empty or false if the Deque is full.  
* offer() -> addCarefully() -> false
* element() -> peek() -> NullPointerException
* peek()  -> peekCarefully() -> null
* poll() -> removeCarefully() -> null
## DLLNode
We chose a doubly-linked base architecture because removing and adding from a DLLNode is O(1). This is because when removing and adding we can change where arrows point to and not shift anything. ArrayList and array-based architecture would be O(n) because after removing the element, we'd have to shift the other elements. 

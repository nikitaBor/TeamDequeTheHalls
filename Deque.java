public interface Deque<T>{
    /*methods to add DLLNodes with addVal to the front or end of a Deque
    returns true if DLLNode has successfully been added
    addFront() and addBack() throw StackOverflowError if the Deque has reached
    its capacity (50)
    addFrontCarefully() and addBackCarefully() return false instead 
    */
    public boolean addFront(T addVal);
    public boolean addFrontCareful(T addVal);
    public boolean addBack(T addVal);
    public boolean addBackCareful(T addVal);
    
    /*methods to remove DLLNodes from the front or end of a Deque
    returns cargo of DLLNode that was removed
    removeFront() and removeBack() throw NullPointerException if Deque is empty
    removeFrontCarefully() and removeBackCarefully() return null if Deque is empty
    */
    public T removeFront();
    public T removeFrontCareful();
    public T removeBack();
    public T removeBackCareful();
    
    /*accessors to obtain the front and end of deque
      if deque is empty, then peekFront() and peekBack()
      throw NullPointerExceptions whereas peekFrontCarefully()
      and peekBackCarefully() return null    
    */
    public T peekFront();
    public T peekFrontCareful();
    public T peekBack();
    public T peekBackCareful();
    
    //returns _size of deque
    public int size();

    //returns boolean indicating whether or not the deque is empty
    public boolean isEmpty();
}

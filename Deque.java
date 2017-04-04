public interface Deque<T>{
    
    public boolean addFront(T addVal);
    public boolean addFrontCareful(T addVal);
    public boolean addBack(T addVal);
    public boolean addBackCareful(T addVal);
    //
    public T removeFront();
    public T removeFrontCareful();
    public T removeBack();
    public T removeBackCareful();
    */
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

    //returns boolean indicating wheter or not the deque is empty
    public boolean isEmpty();
}

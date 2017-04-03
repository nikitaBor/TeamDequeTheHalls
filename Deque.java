public interface Deque<T>{
    
    public boolean addFront(T addVal);
     public boolean addBack(T addVal);
     //
    public T removeFront();
    public T removeFrontCarefully();
    public T removeBack();
    public T removeBackCarefully();
    
    /*accessors to obtain the front and end of deque
      if deque is empty, then peekFront() and peekBack()
      throw NullPointerExceptions whereas peekFrontCarefully()
      and peekBackCarefully() return null    
    */
    public T peekFront();
    public T peekFrontCarefully();
    public T peekBack();
    public T peekBackCarefully();
    
    //returns _size of deque
    public int size();
}

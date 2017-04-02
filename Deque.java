public interface Deque<T>{
    public boolean addFront(T addVal);
    public boolean addFrontCareful(T addVal);
    public boolean addBack(T addVal);
    public boolean addBackCareful(T addVal);
    //
    public T removeFront();
    public T removeFrontCarefully();
    public T removeBack();
    public T removeBackCarefully();
    //
    public T peekFront();
    public T peekFrontCarefully();
    public T peekBack();
    public T peekBackCarefully();
    //
    public int size();
}
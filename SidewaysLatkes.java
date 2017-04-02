//Team DequeTheHalls(Borisov N. & Lum J. & Ngo S.)
//APCS2 pd01
//LAB #02: All Hands on Deque! 
//Due: 2017-04-04
/*
   head->a<->b<->c<->end

*/
public class SidewaysLatkes<T> implements Deque{
    private DLLNode<T> _head;
    private DLLNode<T> _end;
    private int _size;
    
    public SidewaysLatkes(){
        _head = new DLLNode(null,null,null);
        _end = new DLLNode(null,null,null);
        _head.setNext(_end);
        _end.setPrev(_head);
        _size = 0;
    }
}
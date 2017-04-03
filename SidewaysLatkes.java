//Team DequeTheHalls(Borisov N. & Lum J. & Ngo S.)
//APCS2 pd01
//LAB #02: All Hands on Deque! 
//Due: 2017-04-04
/*
   head->a<->b<->c<->end
*/
public class SidewaysLatkes<T> implements Deque{
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;
    
    public SidewaysLatkes(){
        _front = new DLLNode(null,null,null);
        _end = new DLLNode(null,null,null);
        _front.setNext(_end);
        _end.setPrev(_front);
        _size = 0;
    }
    public T removeFront(){
	if(_size == 0){
	    throw new NullPointerException();
	}
	else{
	    T retVal = _front.getNext().getCargo();
	    _front.setNext(_front.getNext().getNext());
	    _front.getNext().setPrev(_front);
	    return retVal;
	}
    }
    public T removeFrontCareful(){
	if(_size == 0){
	    return null;
	}
	else{
	    T retVal = _front.getNext().getCargo();
	    _front.setNext(_front.getNext().getNext());
	    _front.getNext().setPrev(_front);
	    return retVal;
	}
    }
    public T removeBack(){
	if(_size == 0){
	    throw new NullPointerException();
	}
	else{
	    T retVal = _end.getPrev().getCargo();
	    _end.setPrev(_end.getPrev().getPrev());
	    _end.getPrev().setNext(_end);
	    return retVal;
	}
    }
    public T removeBackCareful(){
	if(_size == 0){
	    return null;
	}
	else{
	    T retVal = _end.getPrev().getCargo();
	    _end.setPrev(_end.getPrev().getPrev());
	    _end.getPrev().setNext(_end);
	    return retVal;
	}
    }
    public T peekFront(){
	if (_size == 0){
	    throw new NullPointerException();}
	else { return _front.getCargo();}
    }

    public T peekFrontCarefully(){
	if (_size == 0){
	    return null;}
	else { return _front.getNext().getCargo();}
    }
    
    public T peekBack(){
	if (_size == 0){
	    throw new NullPointerException();}
	else { return _end.getPrev().getCargo();}
    }

    public T peekBackCarefully(){
	if (_size == 0){
	    return null;}
	else { return _end.getPrev().getCargo();}
    }
    public int size(){
        return _size;
    }
}

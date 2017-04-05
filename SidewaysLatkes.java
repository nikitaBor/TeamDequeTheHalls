//Team DequeTheHalls(Borisov N. & Lum J. & Ngo S.)
//APCS2 pd01
//LAB #02: All Hands on Deque! 
//Due: 2017-04-04 

public class SidewaysLatkes<T> implements Deque<T>{
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;
    
    public SidewaysLatkes(){
        _front = new DLLNode<T>(null,null,null);
        _end = new DLLNode<T>(null,null,null);
        _front.setNext(_end);
        _end.setPrev(_front);
        _size = 0;
    }

    public boolean addFront(T addVal){
	if(_size >= 50){
	    throw new StackOverflowError();
	} else if(isEmpty()){
	    DLLNode<T> newNode = new DLLNode<T>(addVal, _front, _end);
	    _front.setNext(newNode);
	    _end.setPrev(newNode);
	    _size += 1;
	} else {
	    DLLNode<T> newNode = new DLLNode<T>(addVal, _front, _front.getNext());
	    _front.getNext().setPrev(newNode);
	    _front.setNext(newNode);
	    _size += 1;
	}
	return true;
    }

    public boolean addFrontCareful(T addVal){
	if(_size >= 50){
	    return false;
	} else {
	    return addFront(addVal);
	}
    }
    
    public boolean addBack(T addVal){
	if(_size >= 50){
	    throw new StackOverflowError();
	} else if(isEmpty()){
	    addFront(addVal);
	} else {
	    DLLNode<T> newNode = new DLLNode<T>(addVal, _end.getPrev(), _end);
	    _end.getPrev().setNext(newNode);
	    _end.setPrev(newNode);
	    _size += 1;
	}
	return true;
    }

    public boolean addBackCareful(T addVal){
	if(_size >= 50){
	    return false;
	} else {
	    return addBack(addVal);
	}
    }

    public T removeFront(){
	if(isEmpty()){
	    throw new NullPointerException();
	}
	else{
	    T retVal = _front.getNext().getCargo();
	    _front.setNext(_front.getNext().getNext());
	    _front.getNext().setPrev(_front);
        _size -= 1;
	    return retVal;
	}
    }

    public T removeFrontCareful(){
	if(isEmpty()){
	    return null;
	}
	else{
	    return removeFront();
	}
    }
    public T removeBack(){
	if(isEmpty()){
	    throw new NullPointerException();
	}
	else{
	    T retVal = _end.getPrev().getCargo();
	    _end.setPrev(_end.getPrev().getPrev());
	    _end.getPrev().setNext(_end);
        _size -= 1;
	    return retVal;
	}
    }
    public T removeBackCareful(){
	if(isEmpty()){
	    return null;
	}
	else{
	    return removeBack();
	}
    }
    public T peekFront(){
	if (isEmpty()){
	    throw new NullPointerException();}
	else { return _front.getNext().getCargo();}
    }

    public T peekFrontCareful(){
	if (isEmpty()){
	    return null;}
	else { return _front.getNext().getCargo();}
    }
    
    public T peekBack(){
	if (isEmpty()){
	    throw new NullPointerException();}
	else { return _end.getPrev().getCargo();}
    }

    public T peekBackCareful(){
	if (isEmpty()){
	    return null;}
	else { return _end.getPrev().getCargo();}
    }
    public int size(){
        return _size;
    }
    public boolean isEmpty(){
        return _size == 0;
    }
    public String toString(){
        String retStr = "";
        DLLNode pointer = _front.getNext();
        for(int i = 0; i < size(); i += 1){
            retStr += pointer.getCargo() + ", ";
            pointer = pointer.getNext();
        }
        return retStr;
    }
    public static void main(String[] args){
        SidewaysLatkes<Integer> ace = new SidewaysLatkes<Integer>();
        ace.addFront(1);
        ace.addFront(2);

        ace.addBack(3);
        System.out.println(ace.peekBack());
        System.out.println(ace.peekFront());
        System.out.println(ace.removeBack());
        System.out.println(ace.removeBack());
        System.out.println(ace.removeFront());
        
    }
}
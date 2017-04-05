// Maggie Xia
// APCS2 pd1
// HW29--Stress is the Best
// 2017-04-04

//Driver class
public class DequeTester {
    
    public static void main ( String[] args ) {

	//Instantiate new Deque
	Deque<String> q = new SidewaysLatkes<String>();
	
	System.out.println("\nTesting enqueue() from front end...");
	q.addFront("uno");
	q.addFront("dos");
	q.addFront("tres");
	//should print: tres dos uno
	System.out.println(q);

	//should print: yi er san
	System.out.println("\nTesting enqueue() from back end...");
	q.addBack("yi");
	q.addBack("er");
	q.addBack("san");
	System.out.println(q);//show how it looks at this point
     
	System.out.println("\nTesting peek() methods...");
	System.out.println( "DLLNode<T>: " );
	System.out.println( q.peekFront() );//tres
	System.out.println( "Back: " );
	System.out.println( q.peekBack() );//san
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( "DLLNode<T>: " );
	System.out.println( q.removeFront() );//tres
	System.out.println( "Second: " );
	System.out.println( q.removeFront() );//dos
	System.out.println( "Third: " );
	System.out.println( q.removeFront() );//uno

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( "DLLNode<T>: " );
	System.out.println( q.removeBack() );//san
	System.out.println( "Second: " );
	System.out.println( q.removeBack() );//er
	System.out.println( "Third: " );
	System.out.println( q.removeBack() );//yi

    }//end main method

}//end class DequeTester
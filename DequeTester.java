// Adris Jautakas, written by Maggie
// APCS2 pd1
// HW29--Stress is the Best
// 2017-04-04

//Driver class
public class DequeTester {
    
    public static void main ( String[] args ) {

	//Instantiate new Deque
	Deque<String> q = new SidewaysLatkes<String>();
	
	System.out.println("\nTesting enqueue() from front end...");
	q.addFirst("uno");
	q.addFirst("dos");
	q.addFirst("tres");
	//should print: tres dos uno
	System.out.println(q);

	//should print: yi er san
	System.out.println("\nTesting enqueue() from back end...");
	q.addLast("yi");
	q.addLast("er");
	q.addLast("san");
	System.out.println(q);//show how it looks at this point
     
	System.out.println("\nTesting get() methods...");
	System.out.println( "First: " );
	System.out.println( q.getFirst() );//tres
	System.out.println( "Last: " );
	System.out.println( q.getLast() );//san
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( "First: " );
	System.out.println( q.removeFirst() );//tres
	System.out.println( "Second: " );
	System.out.println( q.removeFirst() );//dos
	System.out.println( "Third: " );
	System.out.println( q.removeFirst() );//uno

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( "First: " );
	System.out.println( q.removeLast() );//san
	System.out.println( "Second: " );
	System.out.println( q.removeLast() );//er
	System.out.println( "Third: " );
	System.out.println( q.removeLast() );//yi

    }//end main method

}//end class DequeTester

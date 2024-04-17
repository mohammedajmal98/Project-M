package d21GarbageCollection;

//In Java, 'Garbage collector' is called randomly and automatically deallocate/destroy the unused.

/* We can dereference/deallocate,
 * 1) obj1 = null; (It means 'obj1' no longer needed, so we deallocate it)
 * 2) obj1 = obj2; (It means 'obj2' contents given to obj1, so, obj1 contents deallocated.
 * 3) new Box(1,2,3) --> anonymous object - Object without reference --> It is also deallocated by GC
 * 
 * If we want to do something before deleting/deallocating, we use 'finalize()' method
 * 
 */

public class GarbageCollection {
	
	//finalize() method called by 'JVM's Garbage Collector only. We can't call that. But we can add if we need
	//to do some tasks before deleting like closing files etc.,
	
	//don't believe in finalize() to do some imp. tasks because GC is called randomly 
	
//	void protected finalize() {                  //normally defines with 'protected'
//	}

	public static void main(String[] args) {
		

	}

}

import java.util.function.IntBinaryOperator;

//Functional Interface (SAM) - An interface with only single abstract method is called functional interface. 
// You can either use the predefined functional interface provided by Java or create your own functional 
// interface and use it. (SAM - Single Abstract Method)

/* java.util.function -> contains all "Pre defined Functional Interfaces"
 * 	examples: BiConsumer<T,U>, BiFunction<T,U,R>, BinaryOperator<T>, BiPredicate<T,U>, BooleanSupplier	
Consumer<T>, DoubleBinaryOperator, DoubleConsumer, DoubleFunction<R>, DoublePredicate, DoubleSupplier, DoubleToIntFunction, DoubleToLongFunction, DoubleUnaryOperator	
Function<T,R>, IntBinaryOperator, IntConsumer, IntFunction<R>, IntPredicate, IntSupplier, IntToDoubleFunction, IntToLongFunction, IntUnaryOperator, LongBinaryOperator, LongConsumer, LongFunction<R>, LongPredicate, LongSupplier, LongToDoubleFunction, LongToIntFunction, LongUnaryOperator	
ObjDoubleConsumer<T>, ObjIntConsumer<T>, ObjLongConsumer<T>, Predicate<T>, Supplier<T>	
ToDoubleBiFunction<T,U>, ToDoubleFunction<T>, ToIntBiFunction<T,U>, ToIntFunction<T>, ToLongBiFunction<T,U>, ToLongFunction<T>, UnaryOperator<T>
 * 
 * RULE: The functional interface should have Only one abstract method. Along with the 
 * 	one abstract method, they can have any number of default and static methods.
 * 
 * 
 */

public class J03_Functional_Interface {

	public static void main(String[] args) {
		//Example 1 - Creating our own Functional Interface - Refer J01_Lambda_Expression.java
		
		//Example 2 - Using Pre-defined Functional Interface
		//IntBinaryOperator Functional Interface - Represents an operation upon two int-valued operands and producing an int-valued result.
		IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));
        
/*We have been using functional interfaces even prior to java8, they were used by creating 
 * anonymous inner classes using these interfaces. You must have seen functional interfaces such as 
 * Runnable, ActionListener, Comparator etc. They all have single abstract method. Lets see an 
 * example of ActionListener to see how it was used with Anonymous inner class and how it can be 
 * implemented using lambda expression.
 * 
 * Refer comments of "J01_Lambda_Expression.java"
 * 
 */
	}

}

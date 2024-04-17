package d23OOPS;

public class CommandLineArguments {

	public static void main(String[] args) {   //"String[] args" is a command line argument
		
		//Now we pass some "arguments" to the main method
		//Run --> Run Configurations --> (Select the Program) --> (In parameters, we can pass arguments)
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
	}

}

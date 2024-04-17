package printf;

import java.util.Date;
import java.util.Locale;

/* printf() belongs to PrintStream Class - used to print formatted strings using various format specifiers.

Syntaxes available for the printf() method:
	System.out.printf(string);
	System.out.printf(format, arguments);
	System.out.printf(locale, format, arguments);
	
NOTE: 
	System.out.format() is same as System.out.printf() method.
	String.format() returns a formatted string. System.out.printf() also prints a formatted string 
to the console.
	printf() uses the java.util.Formatter class to parse the format string and generate the output.
	
Format specifiers available for printf:
	%c character
	%d decimal (integer) number (base 10)
	%e exponential floating-point number
	%f floating-point number
	%i integer (base 10)
	%o octal number (base 8)
	%s String
	%u unsigned decimal (integer) number
	%x number in hexadecimal (base 16)
	%t formats date/time
	%% print a percent sign
	\% print a percent sign
	%n or \n are used as line separators in printf()
	
Escape characters available in printf():
	\b backspace
	\f next line first character starts to the right of current line last character
	\n newline
	\r carriage return
	\t tab
	\\ backslash
	
Format Specifiers Full Syntax:
		%<flags><width><.precision>specifier
		flags can be set as + for right-aligning, and - for left-aligning. Width gives character space

*/
public class Printf {

	public static void main(String[] args) {
		int x = 10;
		
		//Number Formatting
		System.out.printf(Integer.toString(x) + "%n");	//prints only as String
		System.out.printf("Formatted output is: %d and %d %n", x, -x);
		
		//Float
		System.out.printf("%.5f%n", 2.287);
		System.out.printf("%.2f %n", 2.28734);
		
		//Width Specifier, Aligning, Fill With Zeros
		System.out.printf("%5.2f %n", 2.28734);	//gives 5 character width (right aligned by default)
		System.out.printf("%05.2f \n", 2.28734);// To fill the spaces with zeroes
		System.out.printf("%06.2f \n", -2.28734);
		
		//For left alignment
		System.out.printf("'%-10.2f' \n", -2.28734);
		
		//Using Comma and Locale
		System.out.printf(Locale.US, "%,d \n", 100000);
		
		//String Boolean Formatting
		System.out.printf("%s %s!%n","Hello","World");
		System.out.printf("%b %b %B %n", true, "false", false);
		
		//Time Formatting - ‘H’, ‘M’, ‘S’ - Hours, Minutes, Seconds ‘L’, ‘N’ – to represent the 
		//time in milliseconds and nanoseconds accordingly ‘p’ – AM/PM ‘z’ – prints out the 
		//difference from GMT.
		Date date = new Date();
		System.out.println(date);
		System.out.printf("%tT %n", date);
		System.out.printf("H: %tH, M: %tM, S: %tS %n", date, date, date);
		//The latter one requires many arguments which are the same. Instead, we can replace 
		//them with a single one:
		System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date);
	}

}

package javaFeatures;

//String/Text Block - to write multiple lines in String without "\n & +"

public class F003_String_Block {

	public static void main(String[] args) {
		
		String htmlCode = 
				"""
				<html>
				<body>
				</body>
				</html>
				""";
		
		//Instead of below code
		String htmlCode2 = ""
				+ "<html>"
				+ "\n<body>"
				+ "\n</body>"
				+ "\n</html>";
		
		
		System.out.println(htmlCode);
		System.out.println(htmlCode2);

	}

}

public class StringVsSBuffer {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1 + " " + s2); //String isn't a perfect "Object". It's a special case of "Object"
		System.out.println(s1==s2);  //value-based. So, It'll be "False"
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2);
		System.out.println(sb1==sb2);  //reference-based bcoz 'StringBuffer' is an "Object"
	}
}

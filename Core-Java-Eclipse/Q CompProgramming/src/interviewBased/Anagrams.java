package interviewBased;

//Check whether it is 'anagram' or not 
//Anagram --> conatains same "letters" but different pronounciation

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "anagram";
		String s2 = "nagrams";
		
		if(s1.length() == s2.length()){
			for(int i=0; i<s1.length(); i++){
				for(int j=0; j<s2.length(); j++){
					if(s1.charAt(i) == s2.charAt(j)){
						s2 = s2.replace("" + s1.charAt(i), ""); //use "" before charAt to make the value act as
						//"String"
						break;
					}
				}
			}
			if(s2.length()==0){
				System.out.println("Anagram");
			}
			else{
				System.out.println("Not an Anagram");
			}	
		}
		
		else{
			System.out.println("Not an Anagram");
		}
	}
}

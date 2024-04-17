package leetcode;

import java.util.LinkedList;

public class Q0002AddTwoNumbers {

	public static void main(String[] args) {
		
		//My Try
		LinkedList<Integer> l1 = new LinkedList<Integer>(); 
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);
		

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(7);
		System.out.println(l2);
		
		int c = l1.size();
		int d = l2.size();
		
		
		String l1Reverse = "";
		int l1Sum;
		for(int i=0; i<c; i++){
			l1Reverse += l1.removeLast().toString();		
		}
		l1Sum = Integer.parseInt(l1Reverse);
		System.out.println(l1Sum);
		
		String l2Reverse = "";
		int l2Sum;
		for(int i=0; i<d; i++){
			l2Reverse += l2.removeLast().toString();  		
		}
		l2Sum = Integer.parseInt(l2Reverse);
		System.out.println(l2Sum);
		
		int l3Sum = l1Sum + l2Sum;
		System.out.println(l3Sum);
		
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		int n=1;
		for(int i=0; i>=0; i++){
			n= l3Sum%10;
			if(n==0){
				break;
			}
			l3.addLast(n);
			l3Sum = l3Sum/10;	
		}
		System.out.println(l3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

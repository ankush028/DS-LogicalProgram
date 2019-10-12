package logicalProgram;

import java.util.Arrays;

public class PrimeAnagramReverse {
	public static boolean isAnagram(Object n ,Object m){
		 String a = String.valueOf(n);
		 String b = String.valueOf(m);
		 char p[] = a.toCharArray();
		 char q[] = b.toCharArray();
		 Arrays.sort(p);
		 Arrays.sort(q);
		 if(Arrays.equals(p,q)){
			 return true;
		 }else{
			 return false;
		 }

	}

	public static void main(String[] args) {
		LinkedList<Integer> alist = new LinkedList<>();
		Stack<Integer> s = new Stack<>(); 
		for(int i=0;i<1000;i++){
			if(Prime2D.isPrime(i)){
				alist.add(i);
			}
		}
		alist.show();
		
		for(int i=0;i<alist.size();i++){
			for(int j=i+1;j<alist.size();j++){
				if(isAnagram(alist.index(i), alist.index(j))){
					s.push(alist.index(i));
					s.push(alist.index(j));
				}
			}
		}
		System.out.println("====================================================================");
			s.show();
		System.out.println("=================");
		
		for(int i=0;i<s.size();i++){
			System.out.println(s.pop());
		}
		
		

	}

}

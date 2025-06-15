package variables;

import java.util.Arrays;

public class Count_Example {

	
	static int countofalpha=0;
	static int countofnumerics=0;
	
	public static void main(String[] args) {
		
		String s1 = "Mi cky 05 12 ";
		
			char [] c1=s1.toCharArray();
			System.out.println(Arrays.toString(c1));//with the help of this i can convert the string into array
			
			for(int i =0;s1.length()>i;i++) {
			
			boolean b1= Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			System.out.println(b1);
			
			if(b1==true) {
				
				countofalpha++;
			}
			if(b2==true) {
				
				countofnumerics++;
			}
			
	}
			System.out.println("number of alphabtes->"+countofalpha);
			System.out.println("number of numerics->"+countofnumerics);
	}

}

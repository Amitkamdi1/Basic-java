package Collection_ex;

import java.util.Arrays;

public class While_loop_ex_03 {

	public static void main(String[] args) {

		int [] input = new int[5];//input
		
		input [0]=5;
		input [1]=4;
		input [2]=3;
		input [3]=2;
		input [4]=1;
		int [] output = new int[input.length];//output
		
		output[0]=input[4];
		output[1]=input[3];
		output[2]=input[2];
		output[3]=input[1];
		output[4]=input[0];
		
		
		
		int i = 0;
			int j = 4;
			
			while (j >= 0 && i < 4) {
	            output[j] = input[i];
	            i++;
	            j--;
				
				
			}
			System.out.println(Arrays.toString(input));
			System.out.println(Arrays.toString(output));
	}

}

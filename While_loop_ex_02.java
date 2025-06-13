package Collection_ex;

import java.util.Arrays;

public class While_loop_ex_02 {

	public static void main(String[] args) {

		int [] input = new int[4];//input
		
		input [0]=1;
		input [1]=2;
		input [2]=3;
		input [3]=4;
		
		int [] output = new int[input.length];//output
		
		output[0]=input[3];
		output[1]=input[2];
		output[2]=input[1];
		output[3]=input[0];
		
		int i = 3;
		int j = 0;
		
		while (i >= 0 && j < 4) {
            output[j] = input[i];
            i--;
            j++;
			
			
		}
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
	}

}

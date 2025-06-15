package variables;

public class arraylist {

	public static void main(String[] args) {
		
		int[]  arr = new int [5];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		String s = "Amit Purushottam Kamdi";


		String [] Splitedspring = s.split("Purushottam");

			System.out.println(Splitedspring[0]);
			System.out.println(Splitedspring[1].trim());
			
			for (int i =s.length()-1;i>=0; i--)
			{
		
				System.out.println(s.charAt(i));
		}
	}  
}

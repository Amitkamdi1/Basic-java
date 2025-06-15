package variables;

public class Constructor_01 {
	
	Constructor_01(){
		
		System.out.println("1");
	}
	
  void add() {
	  
	  System.out.println("Non Static");
	  
  }

	public static void main(String[] args) {
		
		new Constructor_01();
		
		Constructor_01 s1 = new Constructor_01();
		s1.add();	
	}

}

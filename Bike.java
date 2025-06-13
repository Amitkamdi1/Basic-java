//Create an interface called Vehicle with a method start().

//Then, create a class Bike that implements the Vehicle interface and provides its own version of the start() method.

//In the main() method, create an object of Bike and call the start() method.

package Collection_ex;

interface Vehicle{
	
	
	void start();
	
	
}

public class Bike implements Vehicle

{
	static void start1()
	{
		
		
	}
	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.start();
	}

	@Override
	public void start() {
		System.out.println("started");
	}
}

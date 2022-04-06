import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the number ");
	    int	num = userinput .nextInt();
	    
	    if(num % 2 == 0)
	    {
	    	System.out.println("The number is even number");
	    	}
	    else
	    {
	    	System.out.println("The number is odd number");
	    }
	}

}

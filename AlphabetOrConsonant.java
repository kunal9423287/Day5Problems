import java.util.Scanner;

public class AlphabetOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0);	 		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character is vowel"+ch); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character is cosonant "+ch);
		      else
			System.out.println("Not an alphabet");		
		}

}

// palindrome program
// num == reverse of num
import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value");
		int num = scan.nextInt();
		int temp = num;
		//storing reverse value 
		int reverse = 0;
		while(num!=0){
			int digit = num%10;
			reverse = reverse * 10 +digit;
			num = num/10;
			
		}
		
		if(temp == reverse){
			System.out.println("given number is palindrome");
		}else{
			System.out.println("given number is not palindrome");
		}
	}

}
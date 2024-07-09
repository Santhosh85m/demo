import java.util.Scanner;
class GCD {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// read user input
		System.out.println("enter first value");
		int n1 = scan.nextInt();
		System.out.println("enter second value");
		int n2 = scan.nextInt();
		//find greatest value
		int greater = n1>n2?n1:n2;
		int hcf =1;
		for(int i = greater/2; i>=2;i--){
			if(n1%i == 0 && n2%i == 0){

			hcf = i;
			break;
			}
		}
		System.out.println();
		System.out.println(hcf + "this is the common divisor of given numbers");	
	}
}
import java.util.Scanner;
//length or count method
public static int length(int num){
  int count =0;
  while (num!=0) {
   int d= num %10;
   count++;
   num = num/10;
   return count;
  }
}
public class Zigzag_Number {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = scan.nextInt();
    System.out.println("enter num2");
    int num2 = scan.nextInt();
    int num1Reverse = 0;
    // reverse of num1
    while (num1!=0) {
      int digit = num1%10;
      num1Reverse = num1Reverse*10+digit;
      num1= num1/10;
    }
    /
    
  }
}

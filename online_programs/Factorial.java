import java.util.Scanner;

class Factorial {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a value");
    // int n = scan.nextInt();
    // int finalRes = factorialcal(n);

    // using long
    long n = scan.nextInt();
    long finalRes = factorialcal(n);
    System.out.println("Factorial of given value is " + finalRes);
  }

  // using int
  // public static int factorialcal(int n) {
  // int result = 1;
  // for (int i = 1; i <= n; i++) {
  // result = result * i;
  // }
  // return result;
  // }
  public static long factorialcal(long n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }
}
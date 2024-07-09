import java.util.Scanner;

class Prime {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter n value");
    int n = scan.nextInt();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i + ", ");
        count++;
      }
    }
    if (count == 2) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}
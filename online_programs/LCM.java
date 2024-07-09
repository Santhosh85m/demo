import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter first value");
    int n1 = scan.nextInt();
    System.out.println("enter Second  value");
    int n2 = scan.nextInt();
    // step1 largest number
    int largest = n1 > n2 ? n1 : n2;
    // step2 intial value for lcm
    int lcm = 0;
    while (true) {
      if (largest % n1 == 0 && largest % n2 == 0) {
        lcm = largest;
        break;
      }
      largest++;
    }
    // for (;; largest++) {
    // if (largest % n1 == 0 && largest % n2 == 0) {
    // lcm = largest;
    // break;
    // }
    // }
    System.out.println(lcm);

  }
}

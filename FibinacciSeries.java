import java.util.Scanner;
//Fibonacci series print
public class FibinacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        int a = 0, b = 1, fib =0;
        for(int i=0;i<value;i++){
            fib = a;
            a = b;
            b = a+fib;
            System.out.println(fib);
        }
    }
}

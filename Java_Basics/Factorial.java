package Java_Basics;

import java.util.Scanner;
//Factorial calculation
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int foo = sc.nextInt();
        sc.close();
        System.out.println(calculateFact(foo));
    }
    static int calculateFact(int x){
        int fact =1;
        while(x>0){
            fact = fact*x;
            --x;
        }
        return fact;
    }
}

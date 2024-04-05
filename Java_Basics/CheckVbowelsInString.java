package Java_Basics;
import java.util.Scanner;
public class CheckVbowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        if(str.matches(".*[aeiouAEIOU].*"))
        System.out.println("string contains vowels");
        else
        System.out.println("string doesnt contains vowels");

    }
}

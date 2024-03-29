package Java_Basics;
import java.util.Scanner;
//Anagrams are the string which are same when reversed..
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int startIndex = 0;
        int EndIndex = str.length()-1;
        boolean Anagrams =true;
        while (startIndex<EndIndex) {
            if(str.charAt(EndIndex)!=str.charAt(startIndex))
            Anagrams = false;
            startIndex++;
            EndIndex--;
        }

        if(Anagrams)
        System.out.println("String is anagram");
        else
        System.out.println("string is not anagram");
        
    }
}

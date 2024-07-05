//TO CHECK WHEATHER THE GIVEN STRING IS PALINDROME OR NOT.
//TASK-2
import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("The given String is Palindrome");   
        }
        else{
            System.out.println("The given String is not a Palindome");
        }

    }
}
//SAMPLE OUTPUT
/*
CASE 1:
 Enter the String
abba
The given String is Palindrome


CASE 2:
Enter the String
abcd
The given String is not a Palindome
 */

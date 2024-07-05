//File Encryption/Decryption
import java.util.*;
public class Encryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=sc.next();
        System.out.println("Enter 1 to Encrypt and 2 to decrypt");
        int a=sc.nextInt();
        for(int i=0;i<input.length();i++){
            if(a==1){
                char c=input.charAt(i);
                char d=(char)(c+1);   // to Encrypt the given input
                System.out.print(d);
            }
            else if(a==2){
                char c=input.charAt(i); //to decrypt the given input
                char d=(char)(c-1);
                System.out.print(d);
            }
            else{
                System.out.print("Invalid"); 
                break;
            }
        }
    }
}
//SAMPLE OUTPUT
/*
CASE 1:
 Enter the String
helloworld
Enter 1 to Encrypt and 2 to decrypt
1
ifmmpxpsme

CASE 2:
Enter the String
helloworld
Enter 1 to Encrypt and 2 to decrypt
2
gdkknvnqkc
 */
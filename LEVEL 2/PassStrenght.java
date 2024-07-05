//Password Strenght Checker
import java.util.*;
public class PassStrenght {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.next();
        int length=password.length();

        boolean lower=false,upper=false,number=false,specialchar=false;
        Set<Character> a=new HashSet<Character>(Arrays.asList('!','@','#','$','&','?'));

        for(char i:password.toCharArray()){
            if(Character.isLowerCase(i)){
                lower=true;
            }
            if(Character.isUpperCase(i)){
                upper=true;
            }
            if(Character.isDigit(i)){
                number=true;
            }
            if(a.contains(i)){
                specialchar=true;
            }}
            System.out.println("Strenght of password is:");
        if(length>=8){
            if(upper && lower && number && specialchar){
            System.out.println("Strong");}
            
        else if(length>=5){
            if(upper || lower && number && specialchar ){
                System.out.println("Moderate");
            }
        }}
        else
            System.out.println("very weak");
    
     }
}

//SAMPLE OUTPUT

/*
 CASE 1:
 Hello@123
Strenght of password is:
Strong

CASE 2:
hello@123
Strenght of password is:
Moderate

CASE 3:
1234
Strenght of password is:
very weak
 */
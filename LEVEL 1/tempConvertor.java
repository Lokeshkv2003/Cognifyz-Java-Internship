// CONVERTING THE GIVEN TEMPERATURE FROM CELSIUS TO FAHRENHEIT OR VICE-VERSA
// TASK-1
import java.util.*;
public class tempConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 while(true){
        System.out.println("1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit\n3.Exit");
           System.out.println("Enter Your Choice");
           int choice=sc.nextInt();
           switch(choice){
             case 1:
                   System.out.println("Enter the fahrenheit temperature:");
                   double f=sc.nextDouble();
                   double Celsius=(f-32)*5/9;
                   System.out.println("The Temperature in the Celsius is:"+Celsius);
                   break;

            case 2:
                  System.out.println("Enter the Celsius temperature:");
                  double c=sc.nextDouble();
                  double Fehrenheit=(c*9/5)+32;
                  System.out.println("The Temperature in the Fehrenheit is:"+Fehrenheit);
                  break;
            case 3:
               System.exit(0);

           default:
                System.out.println("Invalid Input");  
             }
        
        }
    }
}

//SAMPLE OUTPUT:

/* 
1.Fahrenheit to Celsius
2.Celsius to Fahrenheit
3.Exit
Enter Your Choice
1
Enter the fahrenheit temperature:
99
The Temperature in the Celsius is:37.22222222222222
1.Fahrenheit to Celsius
2.Celsius to Fahrenheit
3.Exit
Enter Your Choice
2
Enter the Celsius temperature:
97
The Temperature in the Fehrenheit is:206.6
1.Fahrenheit to Celsius
2.Celsius to Fahrenheit
3.Exit
Enter Your Choice
1
Enter the fahrenheit temperature:
96
The Temperature in the Celsius is:35.55555555555556
1.Fahrenheit to Celsius
2.Celsius to Fahrenheit
3.Exit
Enter Your Choice
3
*/ 
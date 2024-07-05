//TASK-3
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Telugu,Hindi,English,Maths,Science,Social;
        System.out.println("Enter the no.of students");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println("==========================");
        System.out.println("StudentGrade Calculator");
        System.out.println("==========================");
        System.out.println("Enter the "+i+" Student Name:");
        String name=sc.next();
        System.out.println("Enter the marks which are obtained by the "+name);
        Telugu=sc.nextInt(); Hindi=sc.nextInt();English=sc.nextInt();Maths=sc.nextInt();Science=sc.nextInt();
        Social=sc.nextInt();
        System.out.println("Final Marks Obtained In\n"+"Telugu:"+Telugu+"\n"+"Hindi:"+Hindi+"\n"+"English:"+English+"\n"+"Maths:"+Maths+"\n"+"Science:"+Science+"\n"+"Social:"+Social);
        int totmarks=(Telugu+Hindi+English+Maths+Science+Social)/6;
        System.out.println("Total Marks Obtained In All Subjects:"+totmarks);
        if(totmarks>=90){
            System.out.println("O grade");
        }
        else if(totmarks<90 && totmarks>=93){
            System.out.println("A+ grade");
        }
        else if(totmarks<93 && totmarks>=84){
            System.out.println("A grade");
        }
        else if(totmarks<84 && totmarks>=76){
            System.out.println("B+ grade");
        }
        else if(totmarks<76 && totmarks>=65){
            System.out.println("B grade");
        }
        else if(totmarks<65 && totmarks>=54){
            System.out.println("C grade");
        }
        else if(totmarks<54 && totmarks>=40){
            System.out.println("D grade");
        }
        else{
            System.out.println("Failed");
        }
    }
}
}

//SAMPLE OUTPUT

/*1.Fahrenheit to Celsius
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
exit
*/
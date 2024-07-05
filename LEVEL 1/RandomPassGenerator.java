//TASK-4
import java.util.Random;
class RandomPassGenerator{
     public static void main(String[] args) {
        System.out.println(GeneratingPassword(10));
    }

public static char[] GeneratingPassword(int length){
    String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowercase="abcdefghijklmnopqrstuvwxyz";
    String specialchar="#$!@";
    String numbers="0123456789";
    String combinedString=uppercase+lowercase+specialchar+numbers;
    char[] newpassword=new char[length];
    Random random=new Random();
    System.out.println("=======================");
    System.out.println("RandomPassword Generated");
    System.out.println("=======================");
    for(int i=0;i<length;i++){
        newpassword[i]=combinedString.charAt(random.nextInt(combinedString.length()));
    }
    return newpassword;

}}

//SAMPLE OUTPUT

/*
CASE 1:
 =======================
RandomPassword Generated
=======================
4qawSAucBq

CASE 2:
=======================
RandomPassword Generated
=======================
SX@VsaDsq1

 */
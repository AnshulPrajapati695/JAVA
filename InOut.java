import java.util.*;

public class InOut{
    public static void main(String[] args) {
        //output
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        //variables 
        int myInt=1;
        float myFloat=1.5f;
        double myDouble=123.55;
        char myChar='d';
        boolean myBool=true;
        short myShort=1;
        byte myByte=0;
        long myLong=34457;
        
        int a=25;
        int b=10;
        int sum=a+b;
        System.out.println(sum);
        int diff=a-b;
        System.out.println(diff);
        int mul=a*b;
        System.out.println(mul);
        double div=a/b;
        System.out.println(div);

        //input
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        float fees=sc.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(fees);
        

       //take 2 variables 'a' and 'b' and print their sum
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int add=num1+num2;
       System.out.println("Sum=" + add);  
       
       //Make a program that takes the radius of a circle as input,
       //calculates its area and prints it as output to the user.
       double radius=sc.nextDouble();
       double area=3.14*(radius*radius);
       System.out.println("Area of circle = "+ area);

       //Make a program that prints the table of a number that is input by the user
       int number=sc.nextInt();
       System.out.println(number*1);
       System.out.println(number*2);
       System.out.println(number*3);
       System.out.println(number*4);
       System.out.println(number*5);
       System.out.println(number*6);
       System.out.println(number*7);
       System.out.println(number*8);
       System.out.println(number*9);
       System.out.println(number*10);
    }
}
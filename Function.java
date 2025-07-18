import java.util.*;
public class Function{
    //function to print name
    public static void printName(String name){
        System.out.println("Helllo "+name);
        return;
    }

    //function to add two numbers
    public static int sum(int num1,int num2){
        return num1+num2;
    }

    //function to multiply two numbers
    public static int multiply(int num1,int num2){
        return num1*num2;
    }

    //function to find factorial of a number
    public static void factorial(int num1){
        if(num1<0){
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact*=i;
        }
        System.out.println("Factorial of " + num1 + " is " + fact);
    }

    //Make a function to check if a number is prime or not
    public static void checkPrime(int num1){
        if(num1==1||num1==0){
            System.out.println("Number is neither Prime or nor Composite");
            return;
        }
        int count=0;
        for(int i=2;i<num1;i++){
            if(num1%i==0) count=1;
        }
        if(count==0) System.out.println("Number is Prime");
        else System.out.println("Number is not Prime");
    }

    //Make a function to check if a given number n is even or not.
    public static void checkEven(int num1){
        if(num1%2==0) System.out.println("Number is Even");
        else System.out.println("Number is odd");
    }

    //Make a function to print the table of a given number n.
    public static void printTable(int num1){
        for(int i=1;i<=10;i++) System.out.println(num1+" * "+i+" = "+num1*i);
    }

    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name =");
        String name=sc.next();
        printName(name);
        int num1=7;
        int num2=44;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum(num1,num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is " + multiply(num1,num2));
        factorial(num1);
        checkPrime(num1);
        checkEven(num1);
        printTable(num1);
    }
}
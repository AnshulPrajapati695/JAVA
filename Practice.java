import java.util.*;
import java.lang.Math;

public class Practice{
    //Enter 3 numbers from the user & make a function to print their average
    public static void printAvg(int num1,int num2,int num3){
        System.out.println("Average of 3 numbers= "+(num1+num2+num3)/3);
    }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Sum of n odd number = "+sum);
    }

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greater(int a,int b){
        if(a>b) return a;
        else return b;
    }

    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double calculateCircumference(int radius){
        return 2*3.14*radius;
    }

    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void isValidForVote(int age){
        if(age>=18) System.out.println("person is eligible to vote");
        else System.out.println("person is not eligible to vote");
    }

    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
    public static void game(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Wlecome to the Game!\nPlease Enter a limit:");
        int n=sc.nextInt();
        int countNegative=0;
        int countZero=0;
        int countPositive=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter a number OR press '123' for quit : ");
            int input=sc.nextInt();
            if(input==123) {
                System.out.println("Game Over");
                break;
            }
            else if(input==0) countZero++;
            else if(input<0) countNegative++;
            else countPositive++;
        }
        System.out.println("you entered \n"+countNegative+" negative numbers");
        System.out.println( countZero+" zeros");
        System.out.println(countPositive+" positive numbers");
    }
    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
    public static void calculatePower(int x,int n){
        System.out.println("x^n= "+Math.pow(x,n));
    }

    //Write a function that calculates the Greatest Common Divisor of 2 numbers.
   public static void calculateGCD(int a, int b) {
        // Using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD="+Math.abs(a)); // GCD is always non-negative
    }

    //Write a program to print Fibonacci series of n terms where n is input by user :
    //0 1 1 2 3 5 8 13 21 ..... 
    public static void printFibonacciSeries(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.print(a);
                continue;
            }
            if(i==2){
                System.out.print(","+b);
                continue;
            }
            int c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }

    //main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter third number: ");
        int num3=sc.nextInt();
        printAvg(num1,num2,num3);
        System.out.print("Enter a number for sum of ood number= ");
        int n=sc.nextInt();
        printSum(n);
        System.out.println("Greatest number from number 1 and number 2 is "+greater(num1,num2));
        System.out.print("Enter radius of a circle= ");
        int radius=sc.nextInt();
        System.out.println("circumference of a circle= "+calculateCircumference(radius));
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        isValidForVote(age);
        game();
        calculatePower(num1,num2);
        calculateGCD(num1,num2);
        System.out.print("Enter limit for fibonacci series : ");
        int limit=sc.nextInt();
        printFibonacciSeries(limit);
    }
}
import java.util.*;

public class Loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //sum of n numbers
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

        //print the table of that number
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }

        //Print all even numbers till n
        int i=0;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

       /*Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        If the user enters 1 then keep taking input from the user for a student’s
        marks(out of 100).
        If they enter 0 then stop.
        If he/ she scores :
        Marks >=90 -> print “This is Good”
        89 >= Marks >= 60 -> print “This is also Good”
        59 >= Marks >= 0 -> print “This is Good as well”
        Because marks don’t matter but our effort does.
        (Hint : use do-while loop but think & understand why)*/
        int marks;
        do{
        int num=sc.nextInt();
        if(num==1){
                System.out.print("Enter the marks(out of 100)=");
                marks = sc.nextInt();
                if(marks>=90){
                System.out.println("This is Good");
                }
                else if(marks<=89 && marks>=60){
                System.out.println("This is also Good");
                }
                else{
                System.out.println("This is Good as well");
                }
            }
        else{
            break;
        }
        }while(true);

        //Print if a number is prime or not (Input n from the user)
        int number=sc.nextInt();
        int count=0;
        if(number==1||number==0){
            count=1;
        }
        for(int j=2;j<number;j++){
            if(number%i==0){
                count=1;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
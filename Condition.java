import java.util.*;

public class Condition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //to check age is valid for vote or not
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

       //to check number is even or odd
       int number=sc.nextInt();

       if(number%2==0){
        System.out.println("Number is EVEN");
       }
       else{
        System.out.println("Number is ODD");
       }

      //comparision of two numbers
      int a=sc.nextInt();
      int b=sc.nextInt();

      if(a==b){
        System.out.println("Equal");
      }
      else if(a>b){
        System.out.println("a is greater than b");
      }
      else{
        System.out.println("a is smaller than b");
      }
 
     //press the button
     int n=sc.nextInt();

     switch(n){
        case 1: System.out.println("Hello");
                break;

        case 2: System.out.println("Namaste");
                break;

        case 3: System.out.println("Bonjour");
                break;

        default: System.out.println("Invalid button");
     }

    /*Make a Calculator. Take 2 numbers (a & b) from the user and an
    operation as follows :
    1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and
    display it to the user.*/

    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println(" Press 1 : + (Addition) a + b\n Press 2 : - (Subtraction) a - b\n Press 3 : * (Multiplication) a * b\n Press 4 : / (Division) a / b\n Press 5 : % (Modulo or remainder) a % b");
    int op=sc.nextInt();

    switch(op){
        case 1: System.out.println(num1+num2);
        break;
        case 2: System.out.println(num1-num2);
        break;
        case 3: System.out.println(num1*num2);
        break;
        case 4: if(num2==0){
            System.out.println("Invalid Division");
        }
          else{
            System.out.println(num1/num2);
          }
        break;
        case 5: if(num2==0){
            System.out.println("Invalid Division");
        }
          else{
            System.out.println(num1%num2);
          }
        break;
        default: System.out.println("Invalid Operation");
    }

    //Ask the user to enter the number of the month & print the name
    //of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
    System.out.print("Enter the number of month=");
    int month=sc.nextInt();

    switch(month){
        case 1: System.out.println("January");
        break;
        case 2: System.out.println("February");
        break;
        case 3: System.out.println("March");
        break;
        case 4: System.out.println("April");
        break;
        case 5: System.out.println("May");
        break;
        case 6: System.out.println("June");
        break;
        case 7: System.out.println("July");
        break;
        case 8: System.out.println("August");
        break;
        case 9: System.out.println("September");
        break;
        case 10: System.out.println("October");
        break;
        case 11: System.out.println("November");
        break;
        case 12: System.out.println("December");
        break;
        default: System.out.println("Invalid Number");
    }
    }
}
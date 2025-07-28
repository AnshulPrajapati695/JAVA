import java.util.*;
public class string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
        System.out.print("Enter size of Array=");
        int size=sc.nextInt();    
        String[] userInput=new String[size];
        
        int length=0;
        for(int i=0;i<size;i++){
            userInput[i]=sc.next();
            length+=userInput[i].length();
        }
        System.out.println("Total length of Strings in Array = "+length);

        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        //Example : 
        //original = “eabcdef’ ; result = “iabcdif”
        //Original = “xyz” ; result = “xyz”
        System.out.print("Enter a String= ");
        String original=sc.next();
        String result="";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e') result += 'i';
            else result += original.charAt(i);
        }
        System.out.println("Result = "+result);

        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        //Example : 
        //email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        //email = “helloWorld123@gmail.com”; username = “helloWorld123”
        System.out.print("Enter your E-mail= ");
        String eMail=sc.next();
        String username="";
        for(int i=0;i<eMail.length();i++){
            if(eMail.charAt(i)=='@') break;
            else username += eMail.charAt(i);
        }
        System.out.println("Username= "+username);
    }
}
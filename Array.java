import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*int[] marks=new int[3]; OR  
        int marks[]=new int[3];
        marks[0]=96;
        marks[1]=99;
        marks[2]=93;
              OR
        */
        int marks[]={96,99,93};
        for(int i=0;i<3;i++) System.out.println(marks[i]);
        //input an array from user
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0;i<size;i++) numbers[i]=sc.nextInt();
        //output
        for(int i=0;i<size;i++) System.out.println(numbers[i]); 

        //Take an array of names as input from the user and print them on the screen.
        String names[]=new String[size];
        //input
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element=");
            names[i]=sc.next();
        }
        //output
        for(int i=0;i<names.length;i++){
            System.out.println((i+1)+" element="+names[i]);
        }  

       //Find the maximum & minimum number in an array of integers.
       int nums[]={22,4,56,78,55};
       int min=Integer.MIN_VALUE;
       int max=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min) min=nums[i];
        if(nums[i]>max) max=nums[i]; 
       }
       System.out.println("Minimum number is "+min);
       System.out.println("Maximum number is "+max);   

       //Take an array of numbers as input and check if it is an array sorted in ascending order.
       //Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       //{3, 4, 6, 2} is not sorted in ascending order.
      int number[] = new int[size];
      //input
      for(int i=0; i<size; i++) {
          number[i] = sc.nextInt();
      }

      boolean isAscending = true;
      for(int i=0; i<number.length-1; i++) { // NOTICE number.length - 1 as termination condition
           if(number[i] > number[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }


    }
}
public class AdvancePatterns{
    public static  void main(String[] args){
        /*
            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *      */
        //for upper part
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int k=1;k<=8-(2*i);k++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for lower part
                //outer loop
        for(int i=4;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int k=1;k<=8-(2*i);k++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        
    1
   212
  32123
 4321234
543212345      */
        for(int i=1;i<=5;i++){
            //for space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for 1st half
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            //for 2nd half
            for(int z=2;z<=i;z++){
                System.out.print(z);
            }

            System.out.println();
        }

        System.out.println();

        /*
   *
  ***
 *****
*******
*******
 *****
  ***
   *         */
        //for upper part
        for(int i=1;i<=4;i++){
            //space
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //print star
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

          //for lower part
        for(int i=4;i>=1;i--){
            //space
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //print star
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *   

 */
        //for upper part
        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if(i==j||j==1) System.out.print("*");
                else System.out.print(" ");
            }
            //for space
            for(int k=1;k<=10-(2*i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
        //for lower part
        //outer loop
        for(int i=5;i>=1;i-- ){
            //inner loop
            for(int j=1;j<=i;j++){
                if(i==j||j==1) System.out.print("*");
                else System.out.print(" ");
            }
            //for space
            for(int k=1;k<=10-(2*i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
        System.out.println();

/*

    *****
   *   *
  *   *
 *   *
*****

*/
         //outer loop
        for(int i=1;i<=5;i++){
            //inner loop for space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //inner loop for print star
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==5||j==5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }   

        System.out.println();

/*
    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5   */
        for(int i=1;i<=5;i++){
            //space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
       /*
1111
222
33
4        */ 
        int n=1;
        for(int i=4;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print(n);
            }
            System.out.println();
            n++;
        }

        System.out.println();

/*
     1
    1 1
   1 2 1
  1 3 3 1 
 1 4 6 4 1    */
        for (int i = 0; i < 5; i++) {
            // Print spaces to format triangle
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
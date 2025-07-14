public class Patterns{
    public static void main(String[] args){
        /*
            *****
            *****
            *****
            *****    */
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }   

        System.out.println();

        /*
            *****
            *   *
            *   *
            *****     */
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

       System.out.println();

        /*
            *
            **
            ***
            ****   */
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   

        System.out.println();

        /*
            ****
            ***
            **
            *   */
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }   

        System.out.println();

        /*
                *
               **
              ***
             ****   */
        //outer loop
        for(int i=1;i<=4;i++){
            //inner loop for space
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //inner loop for print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   

        System.out.println();

        /*
            1 
            1 2
            1 2 3
            1 2 3 4 
            1 2 3 4 5    */
         //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }   

        System.out.println();

        /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1    */
         //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }   

        System.out.println();

        /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15   */
         //outer loop
         int n=1;
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }   

        System.out.println();

        /*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1    */
        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }   

        System.out.println();

        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop for space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //inner loop for print star
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }   

        System.out.println();

        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop for space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //inner loop for print star
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }   

        System.out.println();
    }
}
public class BitManipulation{
    public static void main(String[] args){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        //Get Bit
        System.out.println(n&bitMask);
        //Set Bit
        System.out.println(n|bitMask);
        //Clear Bit
        System.out.println(~(n)&bitMask);
        //Update Bit
        //for 1
        System.out.println(n|bitMask);
        //for 0
        System.out.println(~(n)&bitMask);
    }
}
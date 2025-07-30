public class stringBuilder{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Teena123@gmail.com");
        System.out.println(sb); 

        //char at any index
        System.out.println(sb.charAt(0));

        //set char any index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at any index
        sb.insert(2,'n');
        System.out.println(sb);

        //delete char from a range where ending index exclude
        sb.delete(2,4);
        System.out.println(sb);

        //insert char at end of string
        sb.append('S');
        System.out.println(sb);

        //print length of string
        System.out.println(sb.length());

        //Reverse of String
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length() - 1 - i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }   
        System.out.println(sb);

        //replace all 'e' with 'i'
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'e') sb.setCharAt(i,'i');
 
        }
        System.out.println(sb);
        
        //return a sub string
        System.out.println(sb.substring(0,7));
     }
}
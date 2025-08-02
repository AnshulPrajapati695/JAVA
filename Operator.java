public class Operator{
    public static void main(String[] args){

        //Assignment operator
        int a=10;
        int b=0;

        //Arithmetic operator
        //*******unary*********
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(a--);
        System.out.println(--a);
        //********binary*******
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Relational/Comparison operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        
        //Logical operator
        System.out.println(a>b&&a==b);
        System.out.println(a>b||a==b);
        System.out.println(!(a==b));

        //Ternary/Conditional operator
        System.out.println(a==b?"a equal to b":"a not equal to b");

        //bitwise operator
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);
        System.out.println(b<<1);
        System.out.println(b>>1);
    }
}
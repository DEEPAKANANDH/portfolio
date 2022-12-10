import java.util.*;
public class Exceptions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        try{
            int c=n/a;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Don't give denominator as the negative value:");
        }
    }
}

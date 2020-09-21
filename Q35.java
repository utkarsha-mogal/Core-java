import java.util.*;
class MathOper{
	static int  add(int n1, int n2){
                   return n1+ n2;
                        }
                 static int  sub(int n1, int n2){
                     return n1- n2;
                        }
                static int  mul(int n1, int n2){
                   return n1*n2;
                       }
                 static double power(int n1, int n2){
                   return  Math.pow(n1,n2);
                       }

}  
class Q35
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter 2 numbers");
    int num1 = sc.nextInt();
     int num2 = sc.nextInt();
       System.out.println("addition is " +MathOper.add(num1,num2));
       System.out.println("substraction is " +MathOper.sub(num1,num2));
       System.out.println("multiplication " +MathOper.mul(num1,num2));
       System.out.println("power " +MathOper.power(num1,num2));
 }
}


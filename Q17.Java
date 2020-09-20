import java.util.*
   public class Q17{
   public static void main(string ar[])	
 {
  Scanner c = new Scanner(system.in);
  system.out.println("Enter the number");
  int n = c.nextInt();
  int re =  0;
  while(n  > 0)
{
  int num = n % 10;
  re = re * 10 + num;
  n = n / 10;
}
 System.out.println("Reverse number "+re);
 }
}

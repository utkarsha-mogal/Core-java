    import java.util.*;
     public class Q8{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("enter priciple amount");

  double PA = sc.nextDouble();
   
  System.out.println("enter rate of interest");
 double ROI = sc.nextDouble();

  System.out.println("enter time");
 double T = sc.nextDouble();

  double SI = ( PA* ROI * T) / 100;
 System.out.println("SI is= "+SI);
}
}
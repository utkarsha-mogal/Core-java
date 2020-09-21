class Forthis{
int abc;
    void demo(int abc){
this.abc=abc;
 System.out.println(this.abc);
  }
}
class Q33
{
 public static void main(String args[])
 {
  Forthis xyz = new Forthis();
   xyz.demo(200);
  }
}
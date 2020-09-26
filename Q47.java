public class MyClass {
    public static void main(String args[]) 
    {
    int intA = 11;
    int intB = 22;
    double dblC = 33;
    
    System.out.println("_________Class2 obj1 = new Class2();________");
    
     
      Class2 obj1 = new Class2();
      
    System.out.println();
    System.out.println("__________Class2 obj2 = new Class2(intA);_________");
    
      
      Class2 obj2 = new Class2(intA);
      
    System.out.println();
    System.out.println("__________Class2 obj3 = new Class2(intA,intB);_________");
      
      Class2 obj3 = new Class2(intA,intB);
    
    System.out.println();
    System.out.println("__________Class2 obj4 = new Class2(dblC);_________");
      
      Class2 obj4 = new Class2(dblC);
      
    }
}



class Class1
{
    Class1()
    {
        System.out.println("You are in Class1 Parameter Less Constructor...");
    }
    Class1(int a)
    {
        System.out.println("You are in Class1 Parameterized Constructor... With : "  + a );
    }
    Class1(double c)
    {
        System.out.println("You are in Class1 Parameterized Constructor... With : "  + c );
    }
}

class Class2 extends Class1
{
    Class2()
    {
        System.out.println("You are in Class2 ParameterLess Constructor...");
    }
     Class2(int b)
    {
        System.out.println("You are in Class1 Parameterized Constructor...  With : " + b);
    }
    Class2(int a, int b)
    {
        super(a);
        System.out.println("You are in Class1 Parameterized Constructor...  With : " + b);
    }
     Class2(double c)
    {
        super(c);
        System.out.println("You are in Class1 Parameterized(double)  Constructor...");
    }
}
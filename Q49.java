import java.util.Scanner;
interface taxable{
	double salesTax = 0.7;
	double incomeTax = 0.10;
	void calTax();
}
class Employee implements taxable{
	int empID;
	double Salary;
	String name;
	Employee(){}
	
	Employee ( int empID, double Salary, String name ){
		this.empID = empID;
		this.Salary=Salary;
		this.name=name;
	}
	public void calTax(){
	double incomeTax1 =  Salary * incomeTax;
		
		System.out.println("Totala incometax is"+incomeTax1 );
	}
}
class Product implements taxable{
	int pID;
	double price;
	int quantity;
	
	Product (int empID, double price, int quantity){
		this.pID = pID;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void calTax(){
		double salesTaxPrice = price * quantity * salesTax;
		System.out.println("Totle incometax is"+salesTaxPrice );
	}
}
class A49{
public static void main(String args[]){
	taxable t = new Employee(1, 10000, "ABC");
	taxable t1 = new Product(1, 500, 5);
	t.calTax();
	t1.calTax();
}
}
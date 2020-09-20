
public class Q28{

	public static void main(String [] args) 
	{
		 String arr[][] = 
			 {
				 {"aa","bb","cc"},
				 {"dd","ee","ff"},
				 {"ff","gg","hh"},
			 };

		 for ( String a[]  :  arr )
		 {
			 for (String aa: a)
			 {
				 System.out.print(aa +  "  ");
			 }
			 System.out.println();
		 }
		
	}

}

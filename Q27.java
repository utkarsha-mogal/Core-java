class Q27 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] { 78, 34, 56, 64, 85, 90, 110, 74, 9, 27 };

		int min = a[0]; 
		int max = a[0]; 

		for (int i = 1; i < a.length; i++)  
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("GreatestNumber in a given array is : " + max);
		System.out.println("SmallestNumber in a given array is : " + min);
	}

}
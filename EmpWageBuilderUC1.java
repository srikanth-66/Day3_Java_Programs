public class EmpWageBuilderUC1
{
	public static void main(String [] args)
	{
		int IS_FULL_TIME=1;
		double empCheack=Math.floor(Math.random() *10)%2;
		if(empCheack==IS_FULL_TIME)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
	}
}
		
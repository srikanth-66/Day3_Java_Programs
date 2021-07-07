
class EmpWageBuilderUC3
{
	public static void main(String arg[])	
	{ 
	    int total_hours_in_day_work=8;
	    int parttime_hours_in_day_work=4;    
	    float Wage_for_hour=20;
	    if((Math.random()*10 )%2==1)
	    {
	   	 double empWage=Wage_for_hour* total_hours_in_day_work;
	    	 System.out.println("employee wage  is="+empWage);
	    }
	    else
	    {
		 double empWage=Wage_for_hour* parttime_hours_in_day_work;
		 System.out.println("employee wage  is="+empWage);
	    }
          }
}
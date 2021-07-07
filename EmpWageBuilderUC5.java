import java.util.*;
import java.lang.*;
public class EmpWageBuilderUC5
{
	public static void main(String[] args)
	{
	    int total_hours_in_day_work=8;
	    int parttime_hours_in_day_work=4;    
	    float Wage_for_hour=20;
	    int total_days_in_month_work=20;
	    if((Math.random()*10 )%2==1)
	    {
	   	 double empWage=Wage_for_hour* total_hours_in_day_work*total_days_in_month_work;
	    	 System.out.println("employee wage  is="+empWage);
	    }
	    else
	    {
		 double empWage=Wage_for_hour* parttime_hours_in_day_work*total_days_in_month_work;
		 System.out.println("employee wage  is="+empWage);
	    }
          }
}
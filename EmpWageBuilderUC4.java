import java.lang.*;
import java.util.Scanner;

public class EmpWageBuilderUC4

{

    public static void main(String args[])

    {

        Scanner input=new Scanner(System.in);
	int no_work_hours_rs=20,full_time,part_time;
	int emp_present=1,emp_absent=0,wage=0,ch=0;

        System.out.printf("enter the choice 1-full 2-part time");
	ch=input.nextInt();

        switch(ch)

        {

            case 1:

            System.out.printf("Enter fulltime hours:");

            full_time=input.nextInt();

            wage=no_work_hours_rs*full_time;

            System.out.printf("The full time wage  is %d\n",wage);

            break;

         

             

            case 2: 
	    System.out.printf("Enter parttime hours:");

            part_time=input.nextInt();
	    wage=no_work_hours_rs*part_time;

            System.out.printf("The part time wage  is %d\n",wage);


	     
            break;

             
            default: System.out.printf("emp is absent");

            break;

             

        }
        }
}
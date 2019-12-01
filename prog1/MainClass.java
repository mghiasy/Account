package Lab1_oop.prog1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[3];
       emps[0] = new Employee("Jim Daley",2000,9,4);
       emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
       emps[2] = new Employee("Susan Randolph", 1997, 2,13);
       
       emps[0].createNewChecking(1000);
       emps[0].createNewRetirement(2000);
       emps[0].createNewSavings(3000);
       
       emps[0].deposite(AccountType.CHECKING, 100);
       emps[0].deposite(AccountType.RETIREMENT, 200);
       emps[0].deposite(AccountType.SAVING, 300);
       
       emps[1].createNewChecking(34000);
       emps[1].createNewSavings(27000);
       emps[1].createNewRetirement(36000);
       
       emps[2].createNewChecking(10038);
       emps[2].createNewSavings(12600);
       emps[2].createNewRetirement(14000);
       
       //System.out.println(e.getFormattedAccountInfo());
       Scanner sc = new Scanner(System.in);
       System.out.print("See a report of all account balance? (y/n)");
       String answer = sc.next();
       if (answer.equalsIgnoreCase("y")) {
    	   String info = getFormattedAccountInfo(emps) ;
    	   System.out.println(info);
       }
       else {
    	   //do nothing
       }
       
       
	}
	static String getFormattedAccountInfo(Employee[] emps){
		String res="";
		for (Employee employee : emps) {
			res+=employee.getFormattedAccountInfo();
		}
		return res;
		}
}

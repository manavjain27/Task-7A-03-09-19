package com.wp.Threading;

public class EmployeeClass extends Thread {

		public int eno;
		public String ename;
		public int basicSal;
		
		
		public EmployeeClass(int eno, String ename, int basicSal) {
			super();
			this.eno = eno;
			this.ename = ename;
			this.basicSal = basicSal;
		}
		
		public void run()
		{
			String ThreadName=Thread.currentThread().getName();
			
			System.out.println(ThreadName+"--------HRA = "+basicSal/10);
			System.out.println(ThreadName+"--------DA = "+basicSal/4);
			System.out.println(ThreadName+"--------CA = "+basicSal/10);
			
		}
		
		public static void main(String args[]) throws Exception
		{
			EmployeeClass e1=new EmployeeClass(1,"Manav",9000);		e1.setName("Employee1");
			EmployeeClass e2=new EmployeeClass(2,"Shivam",4000);	e2.setName("Employee2");
			EmployeeClass e3=new EmployeeClass(3,"Akash",5000);		e3.setName("Employee3");
			EmployeeClass e4=new EmployeeClass(4,"Sunny",6000);		e4.setName("Employee4");
			EmployeeClass e5=new EmployeeClass(5,"Vishnu",7000);	e5.setName("Employee5");
			
			e1.start();
			e2.start();	
			e3.start();	
			e4.start();	
			e5.start();	
			
			System.out.println(".................End Of Main................");
			
		}
		
		
}

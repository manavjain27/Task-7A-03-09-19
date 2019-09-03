package com.wp.Threading;

public class EmployeeClassUsingRunnable implements Runnable {

		public int eno;
		public String ename;
		public int basicSal;
		
		
	
		
		public EmployeeClassUsingRunnable(int eno, String ename, int basicSal) {
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
			EmployeeClassUsingRunnable e1=new EmployeeClassUsingRunnable(1,"Manav",9000);		
			EmployeeClassUsingRunnable e2=new EmployeeClassUsingRunnable(2,"Shivam",4000);	
			EmployeeClassUsingRunnable e3=new EmployeeClassUsingRunnable(3,"Akash",5000);		
			EmployeeClassUsingRunnable e4=new EmployeeClassUsingRunnable(4,"Sunny",6000);		
			EmployeeClassUsingRunnable e5=new EmployeeClassUsingRunnable(5,"Vishnu",7000);	
			
			Thread t1=new Thread(e1);
			t1.setName("Employee1");
			Thread t2=new Thread(e2);
			t2.setName("Employee2");
			Thread t3=new Thread(e3);
			t3.setName("Employee3");
			Thread t4=new Thread(e4);
			t4.setName("Employee4");
			Thread t5=new Thread(e5);
			t5.setName("Employee5");
			
			t1.start();
			t2.start();	
			t3.start();	
			t4.start();	
			t5.start();	
			
			System.out.println(".................End Of Main................");
			
		}
		
		
}



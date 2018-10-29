package com.nissan.training_core_java;

	abstract class car2
	{
		car2()
		{
			System.out.println("Constructor");
		}
		abstract void run();
		void gear()
		{
			System.out.println("Change the gear");
	}

	public class Abs1 extends car2 {
		void run()
		{
			System.out.println("Running the car");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Abs1 c=new Abs1();
	c.run();
	c.gear();
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

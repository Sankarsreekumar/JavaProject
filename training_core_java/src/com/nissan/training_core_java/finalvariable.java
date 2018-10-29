package com.nissan.training_core_java;

public class finalvariable {
final int speedlimit=90;
void run()
{
	speedlimit=100;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
finalvariable obj=new finalvariable();
obj.run();
	}

}

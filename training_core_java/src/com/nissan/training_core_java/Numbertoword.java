package com.nissan.training_core_java;

import java.util.Scanner;

public class Numbertoword {
public static String ntw(double x)
{
	String num[]= {"","one","two","three","four","five","six","seven","eight","nine"};
	String num1[]= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String num2[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	String wrd="";
	String w1,w2="";
	int a1=(int)x;
	int a;
	double x1=x-a1;
	int x2=(int)(x1*100);
	int i[]= {a1,x2};
	a=a1;
	 w1="";
	 w2="";
	int b=a/1000;
	int b1=b/10;
	int b2=b%10;
	int c=a%100;
	int c1=c/10;
	int c2=c%10;
	int h=(a/100)%10;
	if(c1==1)
	{
		wrd=wrd+num1[c2]+" ";
	}
	else
	{
		wrd=wrd+num2[c1]+" "+num[c2]+" ";
	}
	if(a/100!=0)
    if(h!=0)
	wrd=num[h]+" hundred "+wrd;
	if(b!=0)
	{
	if(b1==1)
	{
		wrd=num1[b2]+" thousand "+wrd;
	}
	else
	{
		wrd=num2[b1]+" "+num[b2]+" thousand "+wrd;
	}
	}
	int j=0;int l;
	int z=x2;
	if(x2>0)
	{
		wrd=wrd+"point ";
	while(x2>0)
	{
		j++;
		x2=x2/10;
	}
	while(j>0)
	{
		int digit=(int)(z/Math.pow(10,j-1));
				wrd=wrd+num[digit]+" ";
				z=(int)(z%Math.pow(10,j-1));
				j--;
	}
	}
	return wrd;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto 2 decimal places");
		double a=sc.nextDouble();
		while(a!=0)
		{
			if(a<0)
		System.out.println("minus "+ntw(-a));
			else
		System.out.println(ntw(a));
		System.out.println("Enter the number(Enter zero to exit)");
		try {
		a=sc.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid input");
			break;
		}
		}
	}

}

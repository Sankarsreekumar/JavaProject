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
	int flag=0;
	while(flag<2)
	{
	a=i[flag];
	if(flag==1)
		wrd=wrd+" and";
	flag++;
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
		wrd=wrd+" "+num1[c2];
	}
	else
	{
		wrd=wrd+" "+num2[c1]+" "+num[c2];
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
	if(flag==1)
	wrd="Rupees "+wrd;
	else
		wrd=wrd+" paisa";
	}
	return wrd;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount in digits");
		double a=sc.nextDouble();
		while(a>0)
		{
		System.out.println(ntw(a));
		System.out.println("Enter the amount in digits");
		a=sc.nextDouble();
		}
	}

}

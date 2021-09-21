package com.y4j.multiple;

import com.y4j.viewdata.Printable;

public class Child extends B implements A,Printable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.display();
		ch.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In Show()");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In display()");
	}

}

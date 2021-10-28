package com.xworkz.stadium.sports;

public class SportsRunner {

	public static void main(String[] args) {
		
		Sports ref=new Sports();
		ref.name="Shuttle";
		ref.size=8;
		ref.Starttime=6;
		System.out.println(ref.name);
		String name=ref.name;
		System.out.println(ref.size);
		int size=ref.size;
		System.out.println(ref.Starttime);
		int Starttime=ref.Starttime;
	}

}


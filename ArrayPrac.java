package practise;

import java.util.ArrayList;

public class ArrayPrac {

	public static void main(String[] args) {
	
		
		ArrayList<String> member = new ArrayList<String>();
		member.add("Mary Masunda");
		member.add("Kennedy Masunda");
		member.add("Takudzwa Masunda");
		
		ArrayList<String> jobTitle = new ArrayList<String>();
		jobTitle.add("Quality Controller ");
		jobTitle.add("Aws Techinical Manager");
		jobTitle.add("Lecturer");
		
		ArrayList<String> age = new ArrayList<String>();
		age.add("38");
		age.add("36");
		age.add("33");
		ArrayList<ArrayList<String>> family = new ArrayList<ArrayList<String>>();
		family.add(member);
		family.add(jobTitle);
		family.add(age);
		
		for(ArrayList<String> section : family) {
			for (String x : section) {
				System.out.print(x);
			}
			System.out.println();
		}
		

	}

}

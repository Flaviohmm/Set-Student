package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n1 = scanner.nextInt();
		
		for (int i = 0; i < n1; i++) {
			int code = scanner.nextInt();
			set.add(new Student(code));
		}
		
		System.out.print("How many students for course B? ");
		int n2 = scanner.nextInt();
		
		for (int i = 0; i < n2; i++) {
			int code = scanner.nextInt();
			set.add(new Student(code));
		}
		
		System.out.print("How many students for course C? ");
		int n3 = scanner.nextInt();
		
		for (int i = 0; i < n3; i++) {
			int code = scanner.nextInt();
			set.add(new Student(code));
		}
		
		System.out.println("Total students: " + set.size());
		
		scanner.close();
	}
	
}

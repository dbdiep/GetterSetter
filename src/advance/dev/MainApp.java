package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Student students[] = new Student[10];
		input(students);
		print(students);
	}
	
	static void input(Student students[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			Student std = new Student();
			
			System.out.format("Sinh vien thu %d", i + 1).println();
			
			System.out.println("Nhap ten ");
			std.setName(sc.nextLine());
			
			System.out.println("Nhap tuoi ");
			std.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Nhap dia chi ");
			std.setAddress(sc.nextLine());
			
			System.out.println("Nhap so dien thoai ");
			std.setPhoneNumber(sc.nextLine());
			
			System.out.println("Nhap diem trung binh ");
			std.setMark(sc.nextDouble());
			sc.nextLine();
			
			students[i] = std;
		}
	}
	
	static void print(Student students[]) {
		for (int i = 0; i < students.length; i++) {
			System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s - So dien thoai: %d - Diem trung binh: %.2f", students[i].getName(), students[i].getAge(), students[i].getAddress(), students[i].getPhoneNumber(), students[i].getMark()).println();
		}
	}
	
	static void sapxep(Student students[]) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getMark() > students[j].getMark()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.format("students[%d]=%d ", i , students[i]).println();
		}
	}
}

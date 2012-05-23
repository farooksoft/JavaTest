package com.test.day6.observable;

public class FireAlarmDemo {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("shoaib");
//		Teacher teacher1 = new Teacher("ali");
//		Teacher teacher2 = new Teacher("mubarak");
//		
//		Student student = new Student("srinath");
//		Student student1 = new Student("samba");
		Student student2 = new Student("raghava");
		FireAlarm alarm= new FireAlarm();

		alarm.addObserver(teacher);
//		alarm.addObserver(teacher1);
//		alarm.addObserver(teacher2);
//		
//		alarm.addObserver(student);
//		alarm.addObserver(student1);
		alarm.addObserver(student2);
		alarm.fireAlram();
	}
}

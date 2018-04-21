package cw2;

public class Student {
	int studentId;
	String name;
	String university;

	Student(int studentId, String name, String university) {
		this.studentId = studentId;
		this.name = name;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentId=" + studentId +
				", name='" + name + '\'' +
				", university='" + university + '\'' +
				'}';
	}
}

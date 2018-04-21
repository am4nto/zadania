package cw1;

import cw1.Student;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(101, "ABC", "ABC University");
		Student student2 = new Student(102, "LMN", "LMN University");
		Student student3 = new Student(103, "PQR", "PQR University");
		Student student4 = new Student(104, "UVW", "UVW University");
		Student student5 = new Student(105, "XYZ", "ZYZ University");
		Student studentArray[] = { student3, student5, student1, student4, student2 };

		Result result1 = new Result(111, 101, 70, "A");
		Result result2 = new Result(222, 102, 30, "D");
		Result result3 = new Result(333, 103, 90, "A+");
		Result result4 = new Result(444, 104, 55, "B");
		Result result5 = new Result(555, 105, 45, "C");
		Result resultArray[] = { result1, result2, result3, result4, result5 };

		String topStudentName = getTopStudentName(studentArray, resultArray);
		System.out.println("Najlepszy student: " + topStudentName);
	}

	static String getTopStudentName(Student studentArray[], Result resultArray[]) {
		String topStudentName = "";
		Result bestResult = new Result(000, 0,0,"");
		for(int i = 0; i < resultArray.length; i++){
			if(resultArray[i].score > bestResult.score){
				bestResult = resultArray[i];
			}
		}

		for (int i = 0; i<studentArray.length; i++){
			if (studentArray[i].studentId == bestResult.studentId){
				return studentArray[i].name;
			}
		}
		return topStudentName;
	}
}

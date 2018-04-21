package cw2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
				final Map<Integer, Student> students = generateStudentsMap(100);
		final Map<Integer, Result> results = generateResultMap(100);

		Integer topStudentScore = topStudentScore(results);
		System.out.println("Ocena najlepszego studenta: " + topStudentScore);

		String topStudentName = topStudentName(students, results);
		System.out.println("Imie(nazwa) najlepszego studenta: " + topStudentName);

		print(correctGrades(results));
		print(getStudentsWithScoreHigherThan50(students, results));
		print(getStudentsWithGrades(students, results));
	}

	static void print(List<?>list){
	    for (Object object:list){
            System.out.println(object);
        }
    }

	static List<String> getStudentsWithGrades(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<String> list = new ArrayList<>();
		for(Student student:students.values()){
		    if (results.containsKey(student.studentId)) {
                list.add(student.name + ": " + results.get(student.studentId).grade);
            }
        }
		return list;
	}

	static List<Result> correctGrades(Map<Integer, Result> results) {
		Collection<Result> values = results.values();
		for (Result result:values) {
			if (result.score < 21) {
				result.grade = "E";
			} else if (result.score < 41) {
				result.grade = "D";
			} else if (result.score < 61) {
				result.grade = "C";
			} else if (result.score <81){
				result.grade = "B";
			}else {
				result.grade = "A";
			}
		}
		return new ArrayList<>(values);
	}

	static Integer topStudentScore(Map<Integer, Result> results) {
		int topScore = 0;
		for (Result result: results.values()) {
			if (result.score > topScore){ topScore = result.score;}
		}
		return topScore;
	}

	static String topStudentName(Map<Integer, Student> students, Map<Integer, Result> results) {
		String name = "nie znaleziono studenta";
		int topScore = 0;
		int topId = 0;
		for (Result result: results.values()) {
			if (result.score > topScore) {
				topScore = result.score;
				topId = result.studentId;
			}
		}
		if (students.containsKey(topId)) {
            return students.get(topId).name;
        }
        return name;

	}

	static List<Student> getStudentsWithScoreHigherThan50(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<Student> list = new ArrayList<>();
		int id;
		for (Result result:results.values()) {
			if (result.score > 50) {
				id = result.studentId;
				for (Student student:students.values()) {
					if (student.studentId == id) {list.add(student); }
				}
			}
		}
		return list;
	}

	static Map<Integer, Student> generateStudentsMap(int size) {
		Map<Integer, Student> students = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			String name = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			String university = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			students.put(studentId, new Student(studentId, name, university));
			size--;
		}
		return students;
	}

	static Map<Integer, Result> generateResultMap(int size) {
		Map<Integer, Result> results = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			int resultId = generator.nextInt(100);
			int score = generator.nextInt(100);
			results.put(studentId, new Result(studentId, resultId, score, "A"));
			size--;
		}
		return results;
	}
}

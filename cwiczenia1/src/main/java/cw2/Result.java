package cw2;

public class Result {
	int resultId;
	int studentId;
	int score;
	String grade;

	Result(int resultId, int studentId, int score, String grade) {
		this.resultId = resultId;
		this.studentId = studentId;
		this.score = score;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Result{" +
				"resultId=" + resultId +
				", studentId=" + studentId +
				", score=" + score +
				", grade='" + grade + '\'' +
				'}';
	}
}

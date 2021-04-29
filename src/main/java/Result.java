import enums.Grade;

/**
 * @author ondrej.hosek
 */
public class Result {
	Grade grade;
	Subject subject;

	public Result(final Subject subject, final Grade grade) {
		this.subject = subject;
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

}
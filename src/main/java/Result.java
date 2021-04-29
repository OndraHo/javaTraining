/**
 * @author ondrej.hosek
 */
public class Result {
	int grade;
	Subject subject;


	public Result(final Subject subject, final int grade) {
		this.subject = subject;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

}
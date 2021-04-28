/**
 * @author ondrej.hosek
 */
public class Subject {
	String nameOfSubject;
	int grade;

	public Subject(final String nameOfSubject, final int grade) {
		this.nameOfSubject = nameOfSubject;
		this.grade = grade;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(final String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(final int grade) {
		this.grade = grade;
	}
}
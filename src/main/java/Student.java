import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ondrej.hosek
 */
public class Student {
	String name;
	ArrayList<Subject> subjectArrayList;
	Predmet predmet;

	public Student(String name, ArrayList<Subject> subject) {
		this.name = name;
		this.subjectArrayList = subject;
	}


	public String getName() {
		return name;

	}

	public void setName(final String name) {
		this.name = name;
	}


	public Student(final String name) {
		this.name = name;
	}


	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(final Predmet predmet) {
		this.predmet = predmet;
	}

	public FinalResult checkGrades(ArrayList<Subject> grades) throws InvalidGradeException {
		FinalResult vysledekStudenta = null;
		for (Subject grade : grades) {
			if (grade.getGrade() == 5) {
				vysledekStudenta = FinalResult.NEPROSPEL;
			} else if (grade.getGrade() != 1) {
				vysledekStudenta = FinalResult.PROSPEL;
			} else if (grade.getGrade() == 1) {
				vysledekStudenta = FinalResult.PROSPEL_S_VYZNAMENANIM;
			}
		}
		if (vysledekStudenta != null) {
			return vysledekStudenta;
		} else throw new InvalidGradeException("Invalid grade was inserted.");
	}
}

import java.util.ArrayList;

/**
 * @author ondrej.hosek
 */
public class Student {
	String name;
	ArrayList<Result> resultArrayList;

	public Student(String name, ArrayList<Result> result) {
		this.name = name;
		this.resultArrayList = result;
	}


	public String getName() {
		return name;

	}

//	check the whole list
	public FinalResult checkGrades(ArrayList<Result> grades) throws InvalidGradeException {

		FinalResult studentResult = null;
		for (Result grade : grades) {
			if (grade.getGrade() == 5) {
				studentResult = FinalResult.NEPROSPEL;
			} else if (grade.getGrade() != 1) {
				studentResult = FinalResult.PROSPEL;
			} else if (grade.getGrade() == 1) {
				studentResult = FinalResult.PROSPEL_S_VYZNAMENANIM;
			}
		}
		if (studentResult != null) {
			return studentResult;
		} else throw new InvalidGradeException("Invalid grade was inserted.");
	}
}

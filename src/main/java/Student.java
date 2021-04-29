import java.util.ArrayList;

import enums.FinalResult;
import enums.Grade;
import exception.InvalidGradeException;

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

	public FinalResult checkGrades(ArrayList<Result> grades) throws InvalidGradeException {
		ArrayList<Grade> gradeArrayList = pomocna(grades);
		if (gradeArrayList.contains(Grade.petka)) {
			return FinalResult.NEPROSPEL;
		} else if (sameJednicky(gradeArrayList)) {
			return FinalResult.PROSPEL_S_VYZNAMENANIM;
		} else if (!gradeArrayList.contains(Grade.petka)) {
			return FinalResult.PROSPEL;
		}
		throw new InvalidGradeException("");
	}

	private boolean sameJednicky(final ArrayList<Grade> gradeArrayList) {
		return !gradeArrayList.contains(Grade.dvojka) && !gradeArrayList.contains(Grade.trojka) && !gradeArrayList.contains(Grade.ctyrka);
	}

	private ArrayList<Grade> pomocna(ArrayList<Result> grades) {
		ArrayList<Grade> gradeArrayList = new ArrayList<>();
		for (Result result : grades) {
			gradeArrayList.add(result.getGrade());
		}
		return gradeArrayList;
	}
}

import java.util.ArrayList;

import enums.Grade;
import exception.InvalidGradeException;

/**
 * @author ondrej.hosek
 */
public class Main {
	public static void main(String[] args) throws InvalidGradeException {

		ArrayList<Result> fanovyZnamky = new ArrayList<>();
		Result cestinaZaJedna = new Result(Subject.CESTINA, Grade.jednicka);
		Result matika = new Result(Subject.MATEMATIKA, Grade.jednicka);
		Result telocvik = new Result(Subject.TELOCVIK, Grade.dvojka);
		Result fyzika = new Result(Subject.FYZIKA, Grade.jednicka);
		fanovyZnamky.add(cestinaZaJedna);
		fanovyZnamky.add(matika);
		fanovyZnamky.add(telocvik);
		fanovyZnamky.add(fyzika);
		Student franta = new Student("Franta Pepa Jednicka", fanovyZnamky);

		System.out.println(franta.checkGrades(fanovyZnamky));
	}
}
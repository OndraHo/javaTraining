import java.util.ArrayList;

/**
 * @author ondrej.hosek
 */
public class Main {
	public static void main(String[] args) throws InvalidGradeException {

		ArrayList<Result> fanoviZnamky = new ArrayList<>();
		Result cestinaZaJedna = new Result(Subject.CESTINA, 1);
		Result matika = new Result(Subject.MATEMATIKA, 3);
		Result telocvik = new Result(Subject.TELOCVIK, 2);
		Result fyzika = new Result(Subject.FYZIKA, 4);
		fanoviZnamky.add(cestinaZaJedna);
		fanoviZnamky.add(matika);
		fanoviZnamky.add(telocvik);
		fanoviZnamky.add(fyzika);
		Student franta = new Student("Franta Pepa Jednicka", fanoviZnamky);

		System.out.println(franta.checkGrades(fanoviZnamky));
	}
}
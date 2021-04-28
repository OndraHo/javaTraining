import java.util.ArrayList;

/**
 * @author ondrej.hosek
 */
public class Main {
	public static void main(String[] args) {

		ArrayList<Subject> fanoviZnamky = new ArrayList<>();
		Subject cestinaZaJedna = new Subject("Cestina", 1);
		Subject matikaDva = new Subject("matikaZaDva", 2);
		fanoviZnamky.add(cestinaZaJedna);
		fanoviZnamky.add(matikaDva);
		Student franta = new Student("Franta Pepa Jednicka", fanoviZnamky);

		System.out.println(franta.getName() + " dostal " + fanoviZnamky.get(0).getNameOfSubject() + " " + fanoviZnamky.get(0).getGrade());


	}
}
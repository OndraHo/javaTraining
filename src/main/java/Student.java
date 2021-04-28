import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ondrej.hosek
 */
public class Student {
	String name;
	ArrayList<Subject> subjectArrayList;

	public Student(String name, ArrayList<Subject> subject){
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

//	public Subject getSubject() {
//		return subject;
//	}

}

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1,"sanket"),new Student(12,"Adam"), new Student(5,"Eva"));
		
		List<Student> studentsAl = new ArrayList<>(students);
		
		Collections.sort(studentsAl);
		System.out.println("Descending order "+studentsAl);
		
		Collections.sort(studentsAl,new DescendingStudentComparator());
		System.out.println("Asending order"+studentsAl);
//		Set<Integer> numbers = new HashSet<>();
		
	}

}

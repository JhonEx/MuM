package lesson11.problem1;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> studentsHash = new HashMap<>();
		students.forEach(student -> {
			studentsHash.put(new Key(student.getFirstName(), student.getLastName()), student);
		});
		return studentsHash;
	}
}

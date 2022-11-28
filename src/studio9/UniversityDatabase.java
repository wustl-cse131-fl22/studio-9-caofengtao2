package studio9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map base = new HashMap<String, Student>();

	public void addStudent(String accountName, Student student) {
		// TODO
		base.put(accountName, student);
		
	}

	public int getStudentCount() {
		// TODO
		return base.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if (base.containsKey(accountName)) {
			return ((Student)base.get(accountName)).getFullName();
		}
		else {
			return null;
		}
	}

	public double getTotalBearBucks() {
		// TODO
		double sum =0.0;
		for (String s: (Set<String>)base.keySet()) {
			sum+=((Student)base.get(s)).getBearBucksBalance();
		}
		return sum;
	}
}

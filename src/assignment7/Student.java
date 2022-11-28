package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int studentIDNumber;
	private int attemptedCredits;
	private int passingCredits;
	private double totalGradeQualityPoints;
	private double bearBucksBalance;
	
	public Student (String initFirstName, String initLastName, int initStudentIDNumber) {
		firstName=initFirstName;
		lastName=initLastName;
		studentIDNumber=initStudentIDNumber;
		
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public int getId() {
		return studentIDNumber;
	}
	public void submitGrade(double grade, int credits) {
		attemptedCredits+=credits;
		if (grade>=1.7) {
			passingCredits+=credits;
		}
		totalGradeQualityPoints+=grade*credits;
		
	}
	public int getTotalAttemptedCredits() {
		return attemptedCredits;
		
	}
	public int getTotalPassingCredits() {
		return passingCredits;
	}
	public double calculateGradePointAverage() {
		return totalGradeQualityPoints/attemptedCredits;
	}
	public String getClassStanding() {
		if(passingCredits<30) {
			return "First Year";
		}
		else if(passingCredits<60) {
			return "Sophomore";
		}
		else if(passingCredits<90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	public boolean isEligibleForPhiBetaKappa() {
		if(attemptedCredits>=98&&this.calculateGradePointAverage()>=3.6||attemptedCredits>=75&&this.calculateGradePointAverage()>=3.8) {
			return true;
		}
		else {
			return false;
		}
	}
	public void depositBearBucks(double amount) {
		bearBucksBalance+=amount;
	}
	public void deductBearBucks(double amount) {
		bearBucksBalance-=amount;
	}
	public double getBearBucksBalance() {
		return bearBucksBalance;
	}
	public double cashOutBearBucks() {
		if(bearBucksBalance>=10) {
			double num = bearBucksBalance-10;
			bearBucksBalance=0;
			return num;
			
			
		}
		else {
			bearBucksBalance=0;
			return 0;
		}
		
	}
	public Student createLegacy(String firstName, Student other, boolean isHyphenated, int id) {
		if (isHyphenated==false) {
			Student child = new Student (firstName, this.lastName, id);
			child.depositBearBucks(this.cashOutBearBucks()+other.cashOutBearBucks());
			return child;
		}
		else {
			Student child = new Student (firstName, this.lastName+"-"+other.lastName, id);
			child.depositBearBucks(this.cashOutBearBucks()+other.cashOutBearBucks());
			return child;
		}
		
		
	}
	public String toString() {
		return firstName+" "+lastName+" "+studentIDNumber;
	}
}

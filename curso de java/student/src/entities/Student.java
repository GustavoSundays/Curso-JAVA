package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double FinalGrade(){
		return note1 + note2 + note3;
	}
	
	public String Result(){
		if (FinalGrade() >= 60){
			return "PASS";
		} else {
			return "FAILED \nMISSING " + (60 - FinalGrade() + "POINTS");
		}
	}
	
	public String toString(){
		return "FINAL GRADE = "
			+ String.format("%.2f\n", FinalGrade())
			+ Result();
	}
}

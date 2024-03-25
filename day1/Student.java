package wk1.day1;

public class Student {
	
		
	
	String studentName = "Sathish";
	long rollNo  = 83108133040l;
	
	
	
	public static void main(String[] args) {
		
		String collegeName = "Anna University";
		int markScored  = 92;
		float cgpa  = 9.2f;
		
		Student stu = new Student();
		
		System.out.println("Studnet Name  = "+ stu.studentName);
		System.out.println("Studnet rollNo  = "+ stu.rollNo);
		System.out.println("College Name = "+ collegeName);
		System.out.println("Mark Scored = "+ markScored);
		System.out.println("CGPA = "+ cgpa);
	

}
}
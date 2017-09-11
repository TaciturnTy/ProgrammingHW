public class Student
{
	private String firstName;
	private String lastName;
	private double gpa;

	public Student()
	{
		firstName = "";
		lastName = "";
		gpa = 0;
	}
	
	public Student(String f, String l)
	{
		firstName = f;
		lastName = l;
		gpa = 0;
	}
	
	public Student(String f, String l, double gpa)
	{
		firstName = f;
		lastName = l;
		gpa = gpa;
	}
	
	public void setStudent(String f, String l, double gpa)
	{
		firstName = f;
		lastName = l;
		this.gpa = gpa;
	}
	
	public void setFirst(String f)
	{firstName = f;}
	
	public void setLast(String l)
	{lastName = l;}
	
	public void setGpa(double gpa)
	{this.gpa = gpa;}

	public String getName()
	{
		String name = "";
		name += firstName + " " + lastName;	
		return name;
	}
		
	public double getGpa()
	{return gpa;}
		
	public String getStudentInfo()
	{
		String student = "";
		student += firstName + " " + lastName + " " + gpa;	
		return student;
	}
	
	public String toString()
	{
		String info = "";
		
		info += this.firstName + " " + this.lastName + " " + this.gpa;	
		
		return info;
	}

	public boolean compareStudent(Student person)
	{
		boolean equal = false;
		String firstStu = this.toString();
		String secondStu = person.toString();

		if(firstStu.compareTo(secondStu) == 0)
			equal = true;
		
		return equal;
	}
		
	public void makeCopy(Student s)
	{
		s.firstName = this.firstName;
		s.lastName = this.lastName;
		s.gpa = this.gpa;
	}
	
	public Student getCopy()
	{
		Student temp = new Student();
		
		temp.firstName = this.firstName;
		temp.lastName = this.lastName;
		temp.gpa = this.gpa;
	
		return temp;
	}
}























	
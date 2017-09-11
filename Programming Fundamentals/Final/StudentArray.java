public class StudentArray
{
	public static void main(String[] args)
	{
		Student Tyler = new Student();

		Tyler.setStudent("Tyler", "Paulley", 4.0);
		
		System.out.println("Here is a student: " + Tyler);
		
		System.out.println(Tyler.getStudentInfo());
		
		Student Ethan = new Student();
		
		Ethan = Tyler.getCopy();
		
		System.out.println();
	
		if(Ethan.compareStudent(Tyler))
			System.out.println("YES!!! It Worked!!");
		else
			System.out.println("You suck at Programming!!!");
		
		Student[] CSclass = new Student[4];
		
		for(int i = 0; i < CSclass.length; i++)
			CSclass[i] = new Student();

		CSclass[0].setStudent("Tyler", "Paulley", 4.0);
		CSclass[1].setStudent("Ethan", "Paulley", 2.23);
		CSclass[2].setStudent("Failing", "Student", .64);
		CSclass[3].setStudent("John", "Dough", 3.4);
		
		System.out.println(CSclass[1]);
		
		System.out.println();

		for(int i = 0; i < CSclass.length; i++)
			System.out.println(CSclass[i]);
	}
}

















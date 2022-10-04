
public class Lab10_1 {

	public static void main(String[] args) {
		
			Course programming = new Course("Java Programming"); 
			Faculty david = new Faculty("David"); 
			programming.setFaculty(david); 
			david.addCourse(programming);
			Course finiteElement = new Course("Finite Element"); 
			finiteElement.setFaculty(david); 
			david.addCourse(finiteElement);
			Course graphics = new Course("Engineering Graphics"); 
			david.addCourse(graphics);
			Student student1 = new Student("Thomas"); 
			Student student2 = new Student("Theadore"); 
			Student student3 = new Student("Joseph");
			programming.addStudent(student1); 
			programming.addStudent(student2); 
			programming.addStudent(student3);
			


	}

}
class Student{
	int i=0;
	String name;
	Student(String name){
		this.name=name;
	}
	private Course[] courselist;
	public void addCourse(Course course) {
		courselist[i]=course;
		i++;
		return;		
	}
		
	
}
class Course{
	int i=0;
	private Student[] classlist=new Student[50];
	private Faculty faculty;
	String className;
	Course(String className){
		this.className=className;
	}
	public void addStudent(Student student) {
		classlist[i]=student;
		
		i++;
		System.out.println("The student "+student.name+" is added to the course "+className);
		return;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty=faculty;
		
		return;
	}
}

class Faculty{
	private Course[] courselist=new Course[2];
	String faculty;
	int i=0;
	Faculty(String faculty){
		this.faculty=faculty;
	}
	public void addCourse(Course course) {
		if (i<2) {
			courselist[i]=course;
			course.setFaculty(this);
			i++;
			System.out.println(course.className+" is taught by "+faculty);
		}
		else
			System.out.println("The faculty "+faculty+" is teaching 2 courses already! Failed to add course.");
		return;		
		
	}
}
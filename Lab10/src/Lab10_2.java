
public class Lab10_2 {

	public static void main(String[] args) {
	    //Set up courses
	    CourseOffer[] courses = new CourseOffer[3];
	    courses[0] = new CourseOffer("Java Programming");
	    courses[1] = new CourseOffer("Applied Mechanics");
	    courses[2] = new CourseOffer("Physics");
	    
	    //Create students
	    StudentReg s1 = new StudentReg("Mike");
	    StudentReg s2 = new StudentReg("Elisa");
	    StudentReg s3 = new StudentReg("Jason");
	    StudentReg s4 = new StudentReg("Mary");

	    //Student selects courses
	    s1.addCourse(courses[0]);
	    s2.addCourse(courses[1]);
	    s3.addAllCourses(courses);
	    s4.addCourse(courses[1]);
	    s4.addCourse(courses[2]);
	    
	    //Printout the names of students in each course
	    for (int i=0; i<courses.length; i++){
	      courses[i].printStudentNames();
	    }
	    
	    System.out.println("***After Jason drops a course");
	    s3.dropCourse(courses[1]);
	    for (int i=0; i<courses.length; i++){
	      courses[i].printStudentNames();
	    }


	}

}


class CourseOffer {

private String name;
private StudentReg[] students = new StudentReg[100]; 
private int numberOfStudents;
   public CourseOffer(String name) {
       this.name = name;
   }
   public void addStudent(StudentReg student) {
       students[numberOfStudents] = student;
       numberOfStudents++;
   }
   public StudentReg[] getStudents() {
       return students;
   }
   public int getNumberOfStudents() {
        return numberOfStudents;
   }
   
   // Remove a student from the course
   public void dropStudent(StudentReg student) { 
	   // *** missing codes here
	   for (int i=0;i<numberOfStudents;i++)
 		  if(students[numberOfStudents]==student)
 			  for (int j=i;j<numberOfStudents-1;j++)
 				 students[j]=students[j+1];
	   numberOfStudents--;
	   
   }
   public void printStudentNames(){
	   // *** missing codes here
	   System.out.println("Students in "+name+":");
	   for(int i=0;i<numberOfStudents;i++)
		   System.out.println(students[i].getName());
		   
	   
   }
}


class StudentReg {
	private String name;
	private CourseOffer[] courses = new CourseOffer[10]; 
	private int numberOfCourses;
	public StudentReg(String name) {
		this.name = name;
	}
	public String getName(){
       return name; 
	}
	public void addCourse(CourseOffer course) { 
		// *** missing codes here
		courses[numberOfCourses]=course;
		numberOfCourses++;
		course.addStudent(this);
		
	}
	public void addAllCourses(CourseOffer[] courses) { 
		// *** missing codes here
		for (int i=0;i<3;i++,numberOfCourses++) {
			this.courses[numberOfCourses]=courses[i];
			courses[i].addStudent(this);
			
		}
		
	}

       public CourseOffer[] getCourses() {
        return courses;
      }
      public int getNumberOfCourses() {
        return numberOfCourses;
      }
      public void dropCourse(CourseOffer course) { 
    	  // *** missing codes here
    	  for (int i=0;i<numberOfCourses;i++)
    		  if(courses[numberOfCourses]==course)
    			  for (int j=i;j<numberOfCourses-1;j++)
    				  courses[j]=courses[j+1];
    	  numberOfCourses--;
    	  course.dropStudent(this);
      }
}
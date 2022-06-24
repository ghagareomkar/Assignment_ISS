  
  public class Student {
      static int studentCount;
	  
      final String school="DPS";
      private int id;
	  private String name;
	  private String gender;
	  private int age;
	  private long phone;	  
	  private double gpa;	  
	  private char degree;
	  
	  private boolean international;
	  private double tuitionFees = 12000.0;
	  private double internationalFees = 5000.0;
	  
	  Student(int id, String name, String gender, int age, long phone, double gpa, 
				char degree) {		  
	      this(id, name, gender, age, phone, gpa, degree, false);		  
	  }
	  
	  Student(int id, String name, String gender, int age, long phone, double gpa, 
					char degree, boolean international) {
		  this.id = id;
		  this.name = name;
		  this.gender = gender;
		  this.age = age;
		  this.phone = phone;
		  this.gpa = gpa;
		  this.degree = degree;
		  this.international = international;
		  
		  
	  }
	  
	  final double fixedFee() {
		  tuitionFees = tuitionFees * 1.5 ;
		  return tuitionFees;
	  }
	  
	  double computeFees() {
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  return tuitionFees;
		  }
		  else
			  return tuitionFees;
	  }
	  
	  void display() {
		  
		  studentCount = studentCount + 1;
		  int nextId = id + 1;
		  System.out.println("\nSchool Name: " + school);
		  System.out.println("id: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  
		  tuitionFees=this.fixedFee();
		  System.out.println("FixedFees: " + tuitionFees);
		  
		  tuitionFees=this.computeFees();
		  System.out.println("TotalFees: " + tuitionFees);
		  
		  
	  }
	  public static void main(String[] args) {
	      Student student1 = new Student(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B');
	      student1.display();
		  
		  Student student2 = new Student(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  student2.display();
		  
		  Student student3 = new Student(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  student3.display();
		  
		  System.out.println("Total student count "+Student.studentCount);
		  
	  }
  }


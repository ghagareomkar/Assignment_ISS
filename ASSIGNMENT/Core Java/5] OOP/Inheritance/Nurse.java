class User {
    
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	// add rest of the variables
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
class Patient extends User{
    private long patientId;
    private boolean insured;
    
    	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public boolean isInsured(){
	    return insured;
	}
	
}
class Staff extends User{
    private long staffId;
    private int yearsOfExperience;
    private String description;
    private double salary;
    
    public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	 public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class Doctor extends Staff{
    private long doctorId;
    private String specialization;
    
    public long getDoctorId(){
        return doctorId;
    }
    public void setDoctorId(long doctorId){
        this.doctorId=doctorId;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
}
public class Nurse extends Staff{
    private long nurseId;
    
    public long getNurseId(){
        return nurseId;
    }
    public void setNurseId(long nurseId){
        this.nurseId=nurseId;
    }
    
    public static void main(String[] args) {
    	Nurse n = new Nurse();
    	n.setId(123456789);
    	n.setFirstName("Raj");
    	n.setLastName("Patil");
    	n.setStaffId(456123789);
    	n.setNurseId(012456);
    	System.out.println("Name of the nurse is "+n.getFirstName());
    	
    	Patient p = new Patient();
    	p.setFirstName("Omkar");
    	p.setPatientId(7789456);
    	System.out.println("Patient Name: "+p.getFirstName()+" Patient ID :"+p.getPatientId());
    }
}


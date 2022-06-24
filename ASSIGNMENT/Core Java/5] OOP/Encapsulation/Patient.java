public class Patient{
	   private String name;
	   private String patientId;
	   private int age;
	   
	   public void setDetails(String newName,String newPatientId, int newAge) {
		   name= newName;
		   patientId= newPatientId;
		   age= newAge;
	   }
	   public String getName() {
		   return name;
	   }
	   public String getPatientId() {
		   return patientId;
	   }
	   public int getAge() {
		   return age;
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p= new Patient();
		p.setDetails("Omkar","APX0000123",22);
		System.out.print("Patient Name "+p.getName()+" Patient Age "+p.getAge());

	}

}

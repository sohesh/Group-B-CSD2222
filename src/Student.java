
public class Student {
	
	private String name;
	private int age;
	private String programme;
	
	public Student(String name, int age, String programme){
		this.name = name;
		this.age = age;
		this.programme = programme;
	}
	
	public void displayStudentDetails(){
		System.out.println("Name: " + name + " Age: " + age + " Programme: " + programme);
		}

}

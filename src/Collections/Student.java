package Collections;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student(int id,String name) {
		super();
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Id is " + this.id + " Name is " + this.name + "\n";
	}
	
	@Override
	public int compareTo(Student that) {
		return Integer.compare(that.id, this.id);
	}

}

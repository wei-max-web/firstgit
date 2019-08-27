package zz;

public class type {
	int id;
	String name;
	public type() {
		
	}
   public type(String name) {
		this.name = name;
	}
	public type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}

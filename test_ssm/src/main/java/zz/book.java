package zz;

public class book {
	private int id;
	private String name;
	int sex;
	int tyid;
	String typename;
	
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	String [] sexs = {"ÄÐ","Å®"};
	public String  getsexs() {
		return sexs[sex];
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
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

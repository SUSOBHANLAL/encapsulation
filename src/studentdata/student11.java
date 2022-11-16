package studentdata;

class student11 {
	private String name ;
	private  int age;
	private String Address;
	
	

	public student11(String name,int age,String Address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this . age = age ;
		this . Address = Address;
		
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String toString() {
		return("the name is "+this.getName()+" the age of the student  "+ this.getAge()+"the address is the "+this. getAddress());
	}

	public static void main  (String [] args) {
		student11 suso = new student11("susobhan lal",21,"kolkata ");
		System.out.println(suso.getName());
		System.out.println(suso.getAge());
		System.out.println(suso.getAddress());
		
	}


}

package com.student;

public class students {

	        String name;
	        int     id;
	        String position;
	        String gender;
	        
	public students(String name, int id, String position, String gender) {
				
				this.name = name;
				this.id = id;
				this.position = position;
				this.gender = gender;
			}


	@Override
			public String toString() {
				return "students [name=" + name + ", id=" + id + ", position=" + position + ", gender=" + gender + "]";
			}

	public static void main(String[] args) {
	
		students stu = new students( "ahmad", 123, "Dev", "M");
	//	System.out.println("Name: "+ stu.name);
	//	System.out.println("ID: "   + stu.id);
	//	System.out.println("position: " + stu.position);
		
		//System.out.println(stu.toString());
		System.out.println(stu);
	}

}

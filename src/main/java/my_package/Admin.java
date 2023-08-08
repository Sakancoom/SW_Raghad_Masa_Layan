package my_package;




public class Admin {
	public Admin() {
		super();
		
	}
	protected String id;
	protected String password;
	protected String name;
	protected String email;

public Admin(String id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		
	}



public String getName() {
	return name;
}





public String  showMember() {
	
	
	return "The name is:"+name+ "| ID:"+ id + "| Email:" + email+"\n";
	
}


}

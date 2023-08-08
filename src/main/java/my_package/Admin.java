package my_package;




public class Admin {
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
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

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}




public String  show_member() {
	String h="The name is:"+name+ "| ID:"+ id + "| Email:" + email+"\n";
	/*System.out.printf("The name is:%s | ",name);
	System.out.printf("The id is:%s | ",id);
	System.out.printf("The email is:%s  \n",email);*/
	return h;
	
}


}

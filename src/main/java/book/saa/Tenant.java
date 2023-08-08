package book.saa;

import java.util.ArrayList;
import java.util.List;

public class Tenant {
	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	 String id;
	 String password;
	 String name;
	 String email;
	

	 
public Tenant(String id, String password, String name, String email) {
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
	/*System.out.printf("The Tenant name is:%s | ",name);
	System.out.printf("The  Tenant id is:%s | ",id);
	System.out.printf("The Tenant email is:%s  \n",email);*/
	return h;
	
}


public int checkbill(int n1,int m1)
{
	int bil=n1*m1;
	return bil;
	//System.out.printf("The  bill id is:%s | ",n1*m1);
}



}

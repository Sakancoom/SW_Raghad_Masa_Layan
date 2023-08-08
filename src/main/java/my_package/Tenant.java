package my_package;
public class Tenant {
	public Tenant() {
		super();
		
	}
	protected String id;
	protected String password;
	protected String name;
	protected String email;

public Tenant(String id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		
	}






public String  showMember() {
	
	return "The name is:"+name+ "| ID:"+ id + "| Email:" + email+"\n";
	
}
public int checkbill(int n1,int m1)
{
	
	return n1*m1;

}


}

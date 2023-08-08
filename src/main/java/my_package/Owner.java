package my_package;
public class Owner {
	public Owner() {
		super();
		
	}
	protected String id;
	protected String password;
	protected String name;
	protected String email;
	protected String phoneNum;

public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

public Owner(String id, String password, String name, String email,String phoneNum) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phoneNum=phoneNum;
		
	}




public String  showMember() {
	
	return "The name is:"+name+ "| ID:"+ id + "| Email:" + email+"\n";
	
}


}


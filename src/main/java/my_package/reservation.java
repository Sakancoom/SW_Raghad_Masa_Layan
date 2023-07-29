package my_package;

public class reservation {

	public reservation(String owner_name, String user_name, House h1) {
		super();
		this.Owner_name = owner_name;
		this.User_name = user_name;
		this.h1 = h1;
	}
	protected String Owner_name;
	protected String User_name;
	protected House h1;
	
	
	public String getOwner_name() {
		return Owner_name;
	}
	public void setOwner_name(String owner_name) {
		Owner_name = owner_name;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public House getH1() {
		return h1;
	}
	public void setH1(House h1) {
		this.h1 = h1;
	}
	
}

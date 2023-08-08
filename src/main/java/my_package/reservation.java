package my_package;

public class reservation {

	public reservation(String ownerName, String userName, House h1) {
		super();
		this.ownerName = ownerName;
		this.userName = userName;
		this.h1 = h1;
	}
	protected String ownerName;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public House getH1() {
		return h1;
	}
	public void setH1(House h1) {
		this.h1 = h1;
	}
	protected String userName;
	protected House h1;
	
	
	
	
}

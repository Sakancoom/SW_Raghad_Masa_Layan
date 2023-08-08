package my_package;

public class Request {
	
	public Request() {
		super();
		
	}
	protected String id;
	protected String location;
	
	protected int roomsNum;
	protected int studentNum;
	protected String details;
	protected String price;
	protected String ownerName;
	

public Request(String id,String location,int roomsNum,int studentNum, String details, String price, String ownerName) {
		super();
		this.id=id;
		this.location = location;
		this.roomsNum = roomsNum;
		this.studentNum = studentNum;
		this.details = details;
		this.price=price;
		this.ownerName=ownerName;
		
	}
   

}

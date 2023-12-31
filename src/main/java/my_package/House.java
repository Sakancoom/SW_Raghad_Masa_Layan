package my_package;

public class House {
	public House() {
		super();
		
	}
	protected String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRoomsNum() {
		return roomsNum;
	}

	public void setRoomsNum(int roomsNum) {
		this.roomsNum = roomsNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getHouseFlag() {
		return houseFlag;
	}

	public void setHouseFlag(String houseFlag) {
		this.houseFlag = houseFlag;
	}


	protected String location;
	protected int roomsNum;
	protected int studentNum;
	protected String details;
	protected String price;
	protected String ownerName;
	protected String houseFlag;
	
	

public House(String id,String location,int roomsNum,int studentNum, String details, String price, String ownerName, String houseFlag) {
		super();
		this.id=id;
		this.location = location;
		this.roomsNum = roomsNum;
		this.studentNum = studentNum;
		this.details = details;
		this.price=price;
		this.ownerName=ownerName;
		this.houseFlag=houseFlag;
		
	}

public boolean addHouse(String id,String location,int roomsNum,int studentNum, String details, String price, String ownerName,String houseFlag) {
	boolean isAdd=true;
	for(int i=0;i<Main.Houses.size();i++) {
		if(id.equals(Main.Houses.get(i).id)) {
			isAdd=false;
			break;
		}
	}
	if(!isAdd)return false;
	else {
	House hh=new House(id,location,roomsNum,studentNum,details,price,ownerName,houseFlag);
	Main.Houses.add(hh);
	return isAdd;
	}
	
}
public boolean deleteHouse(String id) {
	boolean isDeleted=false;
	for(int y=0;y<Main.Houses.size();y++) {
		if ((Main.Houses.get(y).id).equals(id))
		{
			Main.Houses.remove(y);
			isDeleted=true;
			
		}
	}
	return isDeleted;
	
}
public String  showHouse() {
	
	return "The  owner name is:"+ownerName+ "| ID:"+ id + "| Location:" + location+"| rooms num:" + roomsNum+"| student num:" + studentNum+"| Details:" + details+ "| HouseFlag:" + houseFlag+"\n";
	
}


}

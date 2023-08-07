package my_package;

public class House {
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected String id;
	protected String Location;
	protected int rooms_num;
	protected int student_num;
	protected String Details;
	protected String Price;
	protected String owner_name;
	protected String HouseFlag;
	boolean addh;
	boolean deleteh; 
	boolean updateh;
	
	

public House(String id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name, String HouseFlag) {
		super();
		this.id=id;
		this.Location = Location;
		this.rooms_num = rooms_num;
		this.student_num = student_num;
		this.Details = Details;
		this.Price=Price;
		this.owner_name=owner_name;
		this.HouseFlag=HouseFlag;
		
	}
public String getHouseFlag() {
	return HouseFlag;
}
public void setHouseFlag(String houseFlag) {
	HouseFlag = houseFlag;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public int getRooms_num() {
	return rooms_num;
}
public void setRooms_num(int rooms_num) {
	this.rooms_num = rooms_num;
}
public int getStudent_num() {
	return student_num;
}
public void setStudent_num(int student_num) {
	this.student_num = student_num;
}
public String getDetails() {
	return Details;
}
public void setDetails(String details) {
	Details = details;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getOwner_name() {
	return owner_name;
}
public void setOwner_name(String owner_name) {
	this.owner_name = owner_name;
}
public boolean add_house(String id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name,String HouseFlag) {
	boolean add=true;
	for(int i=0;i<Main.Houses.size();i++) {
		if(id.equals(Main.Houses.get(i).id)) {
			add=false;
			break;
		}
	}
	if(add==false)return false;
	else {
	House hh=new House(id,Location,rooms_num,student_num,Details,Price,owner_name,HouseFlag);
	Main.Houses.add(hh);
	return add;
	}
	
}
public boolean  delete_house(String id) {
	boolean del=false;
	for(int y=0;y<Main.Houses.size();y++) {
		if ((Main.Houses.get(y).id).equals(id))
		{
			Main.Houses.remove(y);
			del=true;
			
		}
	}
	return del;
	
}
public String  show_House() {
	String h="The  owner name is:"+owner_name+ "| ID:"+ id + "| Location:" + Location+"| rooms num:" + rooms_num+"| student num:" + student_num+"| Details:" + Details+ "| HouseFlag:" + HouseFlag+"\n";
	/*System.out.printf("The name is:%s | ",name);
	System.out.printf("The id is:%s | ",id);
	System.out.printf("The email is:%s  \n",email);*/
	return h;
	
}


}

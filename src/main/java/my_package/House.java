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
	

public House(String id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name) {
		super();
		this.id=id;
		this.Location = Location;
		this.rooms_num = rooms_num;
		this.student_num = student_num;
		this.Details = Details;
		this.Price=Price;
		this.owner_name=owner_name;
		
	}
public boolean add_house(String id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name) {
	boolean add=true;
	for(int i=0;i<Main.Houses.size();i++) {
		if(id.equals(Main.Houses.get(i).id)) {
			add=false;
			break;
		}
	}
	if(add==false)return false;
	else {
	House hh=new House(id,Location,rooms_num,student_num,Details,Price,owner_name);
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
public void update_house(String id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name) {
	for(int y=0;y<Main.Houses.size();y++) {
		if ((Main.Houses.get(y).id).equals(id))
		{
			Main.Houses.get(y).id=id;
			Main.Houses.get(y).Location=Location;
			Main.Houses.get(y).rooms_num=rooms_num;
			Main.Houses.get(y).student_num=student_num;
			Main.Houses.get(y).Details=Details;
			Main.Houses.get(y).Price=Price;
			Main.Houses.get(y).owner_name=owner_name;
		}
	}
}

}

package book.saa;

import java.util.ArrayList;
import java.util.List;

public class House {
	Tenant t=new Tenant();

	
	String id;
	String Location;
	int rooms_num;
 int student_num;
 String Details;
	 String Price;
	 String owner_name;
	String HouseFlag;
	//String TenantId=t.id;
	
	public House()
	{
		super();	
	}
	public House(String id, String Location, int rooms_num, int student_num, String Details, String Price, String owner_name, String HouseFlag) {
		
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
	
	public String  show_House() {
		String h="The  owner name is:"+owner_name+ "| ID:"+ id + "| Location:" + Location+"| rooms num:" + rooms_num+"| student num:" + student_num+"| Details:" + Details+ "| HouseFlag:" + HouseFlag+"\n";
		/*System.out.printf("The name is:%s | ",name);
		System.out.printf("The id is:%s | ",id);
		System.out.printf("The email is:%s  \n",email);*/
		return h;
		
	}

}

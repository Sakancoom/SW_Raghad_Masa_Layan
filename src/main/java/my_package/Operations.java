package my_package;


public class Operations {
	
	
	private Operations() {
		
	}
	
	
	// add house 

public static boolean addH(House h) {
	boolean add=true;
	for(int i=0; i<Main.Houses.size() ; i++) {
		if         ((Main.Houses.get(i).getId().equals(h.getId()))
				&& (Main.Houses.get(i).getLocation().equals(h.getLocation())) 
				&& (Main.Houses.get(i).getRoomsNum()==h.getRoomsNum()) 
				&& (Main.Houses.get(i).getStudentNum()==h.getStudentNum()) 
				&& (Main.Houses.get(i).getDetails().equals(h.getDetails())) 
				&& (Main.Houses.get(i).getPrice().equals(h.getPrice())) 

				&& (Main.Houses.get(i).getOwnerName().equals(h.getOwnerName())))
				{
			    add = false;
				break;
				}
			}
	if(add) {
		Main.Houses.add(h);
		//House.totalpr();
	}
	return add;
}


public static boolean deleteH(House h) {
	 boolean delete =true;
	 
		int index=-1;
		
		for(int i=0; i< Main.Houses.size() ; i++) {
			
			if      ((Main.Houses.get(i).getId().equals(h.getId()))
					
					&& (Main.Houses.get(i).getLocation().equals(h.getLocation())) 
					&& (Main.Houses.get(i).getRoomsNum()==h.getRoomsNum()) 
					&& (Main.Houses.get(i).getStudentNum()==h.getStudentNum()) 
					&& (Main.Houses.get(i).getDetails().equals(h.getDetails())) 
					&& (Main.Houses.get(i).getPrice().equals(h.getPrice())) 

					&& (Main.Houses.get(i).getOwnerName().equals(h.getOwnerName())))
				
				
					{
				    index=i;
				    delete = false;
					break;
					}
				}
		if(!delete) {
			Main.Houses.remove(index);	
			//Statistics.totalpro();
		}
	 return delete;
}

//update the house 


public static boolean updateH(String idd,String House_id,String Location,int rooms_num,int student_num, String Details, String Price, String owner_name,String HouseFlag) {
	boolean update=true;
	int index=-1;
	for(int i=0; i< Main.Houses.size() ; i++) {
		if((Main.Houses.get(i).getId().equals(idd)))
				{
			    index=i;
			    update = false;
				break;
				}
			}
	if(!update) {
		//1
		//House.getH().get(index).setHouse_id(idd);
		Main.Houses.get(index).setId(House_id);
		Main.Houses.get(index).setLocation(Location);
		Main.Houses.get(index).setRoomsNum(rooms_num);
		Main.Houses.get(index).setPrice(Price);
		Main.Houses.get(index).setStudentNum(student_num);
		Main.Houses.get(index).setDetails(Details);
		Main.Houses.get(index).setOwnerName(owner_name);
		Main.Houses.get(index).setHouseFlag(HouseFlag);
	}
	


	return update;
}
	
	
	
	

}
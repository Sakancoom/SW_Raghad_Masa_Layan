package my_package;


public class Operations {
	
	
	public Operations() {
		super();
		
	}
	
	


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
			
		}
	 return delete;
}

//update the house 


public static boolean updateH(String id,String houseId,String location,int roomsNum,int studentNum, String details, String price, String ownerName,String houseFlag) {
	boolean isUpdate=true;
	int index=-1;
	for(int i=0; i< Main.Houses.size() ; i++) {
		if((Main.Houses.get(i).getId().equals(id)))
				{
			    index=i;
			    isUpdate = false;
				break;
				}
			}
	if(!isUpdate) {
		
		
		Main.Houses.get(index).setId(houseId);
		Main.Houses.get(index).setLocation(location);
		Main.Houses.get(index).setRoomsNum(roomsNum);
		Main.Houses.get(index).setPrice(price);
		Main.Houses.get(index).setStudentNum(studentNum);
		Main.Houses.get(index).setDetails(details);
		Main.Houses.get(index).setOwnerName(ownerName);
		Main.Houses.get(index).setHouseFlag(houseFlag);
	}
	


	return isUpdate;
}
	
	
	
	

}
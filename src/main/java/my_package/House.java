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

}

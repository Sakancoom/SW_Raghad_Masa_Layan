package my_package;
import java.util.ArrayList;
import java.util.*;

public class Main {
	public static Scanner input=new Scanner(System.in);
	public static ArrayList <Admin>  Admins=new ArrayList<Admin> ();
	public static ArrayList <Owner>  Owners=new ArrayList<Owner> ();
	public static ArrayList <Tenant>  Tenants=new ArrayList<Tenant> ();
	public static ArrayList <reservation> reservations =new ArrayList<reservation> ();
	public static ArrayList <House>  Houses=new ArrayList<House> ();
	public static ArrayList <request>  requests=new ArrayList<request> ();
	public static HashMap <String,String> ads=new HashMap <String, String> ();
	public static int adFlag=0;
	public static String namee;
	public static String password;
	public static void main(String [] args) {
		 init();
		 
	 }
	public static void init() {
		Admin A1=new Admin("12345","pass1234","Raghad Matar","raghad@gmail.com");
		Admins.add(A1);
		ads.put("Raghad Matar", "pass1234");
		
		Owner O1=new Owner("223344","ahmad11","Ahmad","Ahmad@gmail.com","0599554828");
		Owners.add(O1);
		Owner O2=new Owner("234234","Masa22","Masa","Masa@gmail.com","0594678453");
		Owners.add(O2);
		Owner O3=new Owner("123123","Layan33","Layan","Layan@gmail.com","0598345762");
		Owners.add(O3);
		Tenant T1=new Tenant("2001","alaa200","Alaa","Alaa@gmail.com");
		Tenants.add(T1);
		Tenant T2=new Tenant("2002","Hiba99","Hiba","Hiba@gmail.com");
		Tenants.add(T2);
		Tenant T3=new Tenant("2002","Rania14","Rania","Rania.com");
		Tenants.add(T3);
		
	start();	
	}
	public static void start() {
		System.out.println("Welcome to S A K A N C O M :)\n\r");
		System.out.println("Are you an:\n\r"
				+ "1.Admin.\n\r"
				+ "2.House Owner.\n\r"
				+ "3.Tenant.\n\r");
		int role=input.nextInt();
		if(role==1) {
			AdminActivities();
		}
		else if(role==2) {
			OwnerActivities();
		}
		else if(role==3) {
			TenantActivities();
		}
		else {
			start();
		}
		
		
	}
	public static void admin_login() {
		//int adFlag=0;
		System.out.println("Enter your name:\r\n");
		 namee=input.next();
		System.out.println("Enter your password:\r\n");
		 password=input.next();
		for(int i=0;i<ads.size();i++)
		{
			if(ads.containsValue(namee)) {
				if(ads.get(namee).equalsIgnoreCase(password)) {
					adFlag=1;
					break;
				}
				else {
					System.out.println("The password is Incorrect,please try again");
					AdminActivities();
				}
			}
			else {
				System.out.println("The user name is INVALID as an admin, please try again");
				AdminActivities();
			}
		}
		if(adFlag==1) {
			AdminActivities();
		}
		
	}
	public static void AdminActivities() {
//		int adFlag=0;
//		System.out.println("Enter your name:\r\n");
//		String namee=input.next();
//		System.out.println("Enter your password:\r\n");
//		String password=input.next();
//		for(int i=0;i<ads.size();i++)
//		{
//			if(ads.containsValue(namee)) {
//				if(ads.get(namee).equalsIgnoreCase(password)) {
//					adFlag=1;
//					break;
//				}
//				else {
//					System.out.println("The password is Incorrect,please try again");
//					AdminActivities();
//				}
//			}
//			else {
//				System.out.println("The user name is INVALID as an admin, please try again");
//				AdminActivities();
//			}
//		}
		
			System.out.println("Welcome"+namee+".\r\n What do you want?\r\n ");
			System.out.println("1-Show the list of houses owners.\r\n"
					+ "2-Show the list of the application users.\\r\\n"
					+ "3-Show the list of all houses in the application.\\r\\n"
					+ "4-Show the request of adding houses from the owners.\\r\\n"
					+ "5-Modify existing houses info.\\r\\n"
					+ "6-Show A REPORT about all reservations via the app.\\r\\n"
					+ "7-Check for any sent emails from users or owners.\\r\\n"
					+"8-Log Out\\r\\n");
			int choice=input.nextInt();
			switch(choice) {
			case 1:
			{
				for(int i=0;i<Owners.size();i++) {
					System.out.println("The owners are:\r\n");
					System.out.println((i+1)+" Name: "+ Owners.get(i).name+"\t"+" Email: "+ Owners.get(i).email+"\t"+ " Phone: "+ Owners.get(i).phoneNum+"\n\r");
				}
			}
			break;
			case 2:
			{
				for(int i=0;i<Tenants.size();i++) {
					System.out.println("The Tenants are:\r\n");
					System.out.println((i+1)+" Name: "+ Tenants.get(i).name+"\t"+" Email: "+ Tenants.get(i).email+"\n\r");
				}
			}
			break;
			case 3:
			{
				for(int i=0;i<Houses.size();i++) {
					System.out.println("The Houses are:\r\n");
					System.out.println((i+1)+" Location: "+ Houses.get(i).Location+"\t"+" Details: "+ Houses.get(i).Details+"\t"+" Room number: "+ Houses.get(i).rooms_num+"\t"+" Student number: "+ Houses.get(i).student_num+"\t"+" Price: "+ Houses.get(i).Price+"\t"+" Owner name: "+ Houses.get(i).owner_name+"\t"+"\n\r");
				}
			}
			break;
			case 4:
			{
				for(int i=0;i<requests.size();i++) {
					System.out.println("The pending requests are:\r\n");
					System.out.println((i+1)+"House id:"+requests.get(i).id+"\t"+" Location: "+ requests.get(i).Location+"\t"+" Details: "+ requests.get(i).Details+"\t"+" Room number: "+ requests.get(i).rooms_num+"\t"+" Student number: "+ requests.get(i).student_num+"\t"+" Price: "+ requests.get(i).Price+"\t"+" Owner name: "+ requests.get(i).owner_name+"\t"+"\n\r");
					System.out.println("\n\r Do you want to \n\r"
							+ "1- accept this request, so add the house to the app.\n\r"
							+ "2- reject the request\n\r ");
					int acc=input.nextInt();
					if(acc==1) {
						House hh=new House(requests.get(i).id,requests.get(i).Location,requests.get(i).rooms_num,requests.get(i).student_num,requests.get(i).Details,requests.get(i).Price,requests.get(i).owner_name);
						Houses.add(hh);
						System.out.println("\n\r The house added successfuly \n\r");
						
					}
					else if(acc==2) {
						System.out.println("\n\r The house request removed \n\r ---------------\n\r");
					}
				}
				
			}
			break;
			case 5:
			{
				System.out.println("What do you want to do?\n\r 1-delete a house \n\r 2-add a house");
				House h2=new House();
				int op=input.nextInt();
				if(op==1) {
					System.out.println("choose the id of the house you want to delete\r\n");
					for(int i=0;i<Houses.size();i++) {
						
						System.out.println((i+1)+" ID: "+ Houses.get(i).id+"\t"+" Location: "+ Houses.get(i).Location+"\t"+" Details: "+ Houses.get(i).Details+"\t"+" Room number: "+ Houses.get(i).rooms_num+"\t"+" Student number: "+ Houses.get(i).student_num+"\t"+" Price: "+ Houses.get(i).Price+"\t"+" Owner name: "+ Houses.get(i).owner_name+"\t"+"\n\r");
					}
					String ch=input.next();
					boolean x=h2.delete_house(ch);
				}
				if(op==2) {
					System.out.println("Please, fill the information of the house you want to add\n\r");
					System.out.println("\n\r ID:");
					String idd=input.next();
					System.out.println("\n\r Location:");
					String location=input.next();
					System.out.println("\n\r Details:");
					String details=input.next();
					System.out.println("\n\r Number of rooms:");
					int rooms=input.nextInt();
					System.out.println("\n\r Number of students:");
					int students=input.nextInt();
					System.out.println("\n\r Price:");
					String price=input.next();
					System.out.println("\n\r Owner name:");
					String Owner=input.next();
					h2.add_house(idd, location, rooms, students, details, price, Owner);
				}
			
			}
			break;
			case 6:
			{
				report.generate_report();
				
			}
			break;
			case 7:
			{
				
			}
			break;
			case 8:
			{
				start();
			}
			break;
			default:AdminActivities();
			}
			
		
	
	}
    public static void OwnerActivities() {
		
	}
    public static void TenantActivities() {
		
	}

}

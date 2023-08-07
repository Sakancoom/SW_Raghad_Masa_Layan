package my_package;
import java.util.ArrayList;

import io.cucumber.core.logging.Logger;

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
	public static final  String INVALID="Invalid choice. Please try again.";
	   

    protected static int y;
    public static final  String LOGOUT="You are logged out.";
    public static final  String DEC="%d - ";
    
    protected static Logger logger;
    public static final String NOTE="The Username doesn't exist, please enter your Username again";
    static String Temail; 
	static String Tpass;
	static String TLocation;
	static int Tnum;	static int Tnum2; static int TOP;
	public static void main(String [] args) {
		 init();
		 
	 }
	public static void init() {
		Admin A1=new Admin("12345","pass1234","Raghad","raghad@gmail.com");
		Admins.add(A1);
		ads.put("Raghad", "pass1234");
		
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
		request r1=new request("234","Nablus",5,3,"with balkon","120","Ali");
		requests.add(r1);
		request r2=new request("7484","Nablus",5,4,"with balkon","120","Ahmad");
		requests.add(r2);
		House h1=new House("2033","RasAlain",4,3,"first floor","100","Layan Othman","1");
		Houses.add(h1);
		House h2=new House("2024","BaitWazan",6,4,"with balkon","130","lara ahmad","0");
		Houses.add(h2);
		
		
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
			admin_login();
		}
		else if(role==2) {
			OwnerActivities();
		}
		else if(role==3) {
			LoginTenant();
		}
		else {
			start();
		}
		
		
	}
	public static void admin_login() {
		int nameFlag=0;
		int passFlag=0;
		System.out.println("Enter your name:\r\n");
		 namee=input.next();
		 for(int i=0;i<ads.size();i++) {
				if(Admins.get(i).getName().equalsIgnoreCase(namee)) {
					System.out.println("hereeee");
					nameFlag=1;
					break;
				}
				else {
					System.out.println("The user name is INVALID as an admin, please try again");
					admin_login();
				}
		 }
		 
		
		 while(passFlag==0) {
			 System.out.println("Enter your password:\r\n");
			 password=input.next();
				if(ads.get(namee).equalsIgnoreCase(password)) {
					passFlag=1;
					break;
				}
				else {
					System.out.println("The password is Incorrect,please try again");
					
				}
			
			
		}
		if(nameFlag==1 && passFlag==1) {
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
		int outt=0;
			System.out.println("Welcome"+namee+".\r\n What do you want?\r\n ");
			while(outt==0) {
			System.out.println("1-Show the list of houses owners.\r\n"
					+ "2-Show the list of the application users.\r\n"
					+ "3-Show the list of all houses in the application.\r\n"
					+ "4-Show the request of adding houses from the owners.\r\n"
					+ "5-Modify existing houses info.\r\n"
					+ "6-Show A REPORT about all reservations via the app.\r\n"
					+ "7-Check for any sent emails from users or owners.\r\n"
					+"8-Log Out\r\n");
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
					System.out.println((i+1)+" Location: "+ Houses.get(i).Location+"\t"+" Details: "+ Houses.get(i).Details+"\t"+" Room number: "+ Houses.get(i).rooms_num+"\t"+" Student number: "+ Houses.get(i).student_num+"\t"+" Price: "+ Houses.get(i).Price+"\t"+" Owner name: "+ Houses.get(i).owner_name+"\t"+ Houses.get(i).HouseFlag+"\t"+"\n\r");
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
						House hh=new House(requests.get(i).id,requests.get(i).Location,requests.get(i).rooms_num,requests.get(i).student_num,requests.get(i).Details,requests.get(i).Price,requests.get(i).owner_name,"0");
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
					h2.add_house(idd, location, rooms, students, details, price, Owner,"0");
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
			
		
	
	}
    public static void OwnerActivities() {
    int outt=0;
    	while(outt==0) {
			
			
    		
			
			
			System.out.println("\n Welcome to the Controlpanel for housing plz enter show houses!\r\n"
					+"--------------------------------------------------"
					+"Please select an option from the following menu:\r\n"
					
					+"1.show houses(id ,locations)\r\n"
					
					+"2.add new house(the request is pending until the admin approve it) \r\n"
					
					+"3.Update an existing house \r\n"
					
					+"4.delete house \r\n"
				
					//+"5.show contact info \r\n"
			
					+"5.Please enter the id of the house that you want to know it's number of students(tenant)\r\n"
					
					
					
					+"6. Show more details of specific house \r\n"
					
					+"7. LogOut\r\n"
					
					+"8. Quit\r\n"
					+"Enter the number of the activity you want to perform:\r\n");
					
				int choice;
				
				choice=input.nextInt();
				

				switch(choice) {
					case 1:
						
						
						for(int i=0;i<Houses.size();i++) {
							String l=String.format(DEC, i+1);
							//System.out.println(l);
							System.out.println(Houses.get(i).getId()+
								
		
									"    "+ Houses.get(i).getLocation()+ 
									
									"\r\n");
						}
						break;
							
					case 2:
						/// add to another arraylist cause we need the admin approvel.
						
						
						Scanner id = new Scanner(System.in);//id 
						
						Scanner locat = new Scanner(System.in);//location 
						
						Scanner rn = new Scanner(System.in);//room num
						
						Scanner sn = new Scanner(System.in);//student num
						
						Scanner de = new Scanner(System.in);//details
						
						Scanner pr = new Scanner(System.in);//price
						
						Scanner on = new Scanner(System.in);//owner name


						


						System.out.println("fill the house ID");
						String a = id.next();
						
						System.out.println("fill the location");
						String b=locat.nextLine();
						
						
						System.out.println("fill the num of rooms");
						int c=rn.nextInt();
						
						
						System.out.println("fill the num of students");
						int d=sn.nextInt();
						
						System.out.println("fill the house details");
						String e=de.nextLine();
						
						System.out.println("fill the price");
						String f=pr.nextLine();
						
						System.out.println("fill the owner name");
						String g=on.nextLine();
						
						

						House ad = new House(a,b,c,d, e, f, g,"0");

						boolean addd=Operations.addH(ad);
						
						if(addd) {
							System.out.println("A new House added");
						} else {
							System.out.println("A House is already exist"); 
						}
						break;
						
						
					
						
						
					case 3:
		                
						
						
			Scanner id1 = new Scanner(System.in);//id 
						
						Scanner locat1 = new Scanner(System.in);//location 
						
						Scanner rn1 = new Scanner(System.in);//room num
						
						Scanner sn1 = new Scanner(System.in);//student num
						
						Scanner de1 = new Scanner(System.in);//details
						
						Scanner pr1 = new Scanner(System.in);//price
						
						Scanner on1 = new Scanner(System.in);//owner name
						
						System.out.println("Enter a HOUSE ID you want to update:");
		                
		                String z = id1.next();
		                
		                System.out.println("fill  the new house ID");
						String a1 = id1.next();
						
						System.out.println("fill the new location");
						String b1=locat1.nextLine();
						
						
						System.out.println("fill the new num of rooms");
						int c1=rn1.nextInt();
						
						
						System.out.println("fill the  new num of students");
						int d1=sn1.nextInt();
						
						System.out.println("fill the new house details");
						String e1=de1.nextLine();
						
						System.out.println("fill the  new price");
						String f1=pr1.nextLine();
						
						System.out.println("fill the new owner name");
						String g1=on1.nextLine();
		                
		                
		                
		                
		                boolean update = Operations.updateH(z,a1,b1,c1,d1, e1, f1, g1,"0");
		                
		                if (!update)
		                	System.out.println("A House was updated");
		                else
		                	System.out.println("A House was not exist");
		                break;
						
					
						
					
					case 4:
						
						int index = -1;
		                Scanner id2 = new Scanner(System.in);
		                
		                System.out.println("Enter the house ID you want to delete:");
		                String z1 = id2.next();
		                
		                for (int i = 0; i < Main.Houses.size(); i++) {
		                	
		                    if (Main.Houses.get(i).getId().equals(z1)) 
		                    {
		                        index = i;
		                    }
		                }
		                if (index == -1) {
		                	System.out.println("A house you want to delete does not exist");
		                } else {
		                    boolean delete = Operations.deleteH(Main.Houses.get(index));
		                    if (!delete)
		                    	System.out.println("A house was deleted");	       
		                }


						
						
						
						break;
						
						
						
					//case :
						
						
						
						
						
						
				
						
					case 5:
					
					    Scanner id3 = new Scanner(System.in);
					    System.out.println("Enter the house ID to know the number of students:");
					    String houseId = id3.next();
					    
					    House targetHouse = null;
					    for (House house : Main.Houses) {
					        if (house.getId().equals(houseId)) {
					            targetHouse = house;
					            break;
					        }
					    }
					    
					    if (targetHouse != null) {
					    	System.out.println("House ID: " + targetHouse.getId() +
					                    ", Number of Students: " + targetHouse.getStudent_num());
					    } else {
					    	System.out.println("House with ID " + houseId + " not found.");
					    }
					    break;
						
					
		                
		            	
					case 6:
						
						
						
						
						  Scanner id4 = new Scanner(System.in);
						  System.out.println("Enter the house ID to show more details:");
						    String houseId2 = id4.next();
						    
						    House targetHouse2 = null;
						    for (House house : Main.Houses) {
						        if (house.getId().equals(houseId2)) {
						            targetHouse2 = house;
						            break;
						        }
						    }
						    
						    if (targetHouse2 != null) {
						       
						      
						    	System.out.println("Number of Rooms: " + targetHouse2.getRooms_num());
						        
						       
						    	System.out.println("Details: " + targetHouse2.getDetails());
						    	System.out.println("Price: " + targetHouse2.getPrice());
						      
						    } else {
						    	System.out.println("House with ID " + houseId2 + " not found.");
						    }
						    break;
						
					
		            	
					case 7:
						
				
				

		         
					case 8:
						System.exit(0);
		            	break;


		           
		
				}}
	}
    public static void TenantActivities() {
		
	}
    
	
	 public  static void LoginTenant()
	 {
		 Scanner scanner = new Scanner(System.in);
		 int flag=0;
		 int eflag=1;
			System.out.println(" To log in to  S A K A N C O M enter  Your email and password \n\r"
					+ "enter your email\n\r");
			Temail=scanner.nextLine();
			System.out.println("enter your pass\n\r");
			Tpass=scanner.nextLine();
			Tnum2=0;
			boolean emailFound = false;
			for (int i = 0; i < Tenants.size(); i++) {
			    if (Tenants.get(i).email.equalsIgnoreCase(Temail)) {
			        if (Tenants.get(i).password.equalsIgnoreCase(Tpass)) {
			            flag = 1;
			            Tnum2 = Tnum2 + 1;
			            emailFound = true;
			            break;
			        } else {
			            System.out.println("The password is incorrect, please try again");
			            LoginTenant(); 
			        }
			    }
			}

			if (!emailFound) {
			    System.out.println("The email is INVALID, please try again");
			    LoginTenant(); 
			}

				
			
			if (flag==1)
			{
				Tenantview();
				
			}
			
			
			
	 }
	  public static void Tenantview()

	 {System.out.println("The Houses are:\r\n");
		 for(int i=0;i<Houses.size();i++) {
				
				if(Houses.get(i).HouseFlag.equals("1")) {
				System.out.println((i)+" Location: "+ Houses.get(i).Location+"\t"+" Details: "+ Houses.get(i).Details+"\t"+" Room number: "+ Houses.get(i).rooms_num+"\t"+" Student number: "+ Houses.get(i).student_num+"\t"+" Price: "+ Houses.get(i).Price+"\t"+" Owner name: "+ Houses.get(i).owner_name+"\t" + "booked up"+"\t" +"\n\r");
			}
				else if (Houses.get(i).HouseFlag.equals("0"))
				{
					System.out.println((i)+" Location: "+ Houses.get(i).Location+"\t"+" Details: "+ Houses.get(i).Details+"\t"+" Room number: "+ Houses.get(i).rooms_num+"\t"+" Student number: "+ Houses.get(i).student_num+"\t"+" Price: "+ Houses.get(i).Price+"\t"+" Owner name: "+ Houses.get(i).owner_name+"\t" + "available "+"\t" +"\n\r");
				}
				}
		 TenantActivity();
				}
	 public static void TenantBook() {
		 Scanner scanner = new Scanner(System.in);
			 System.out.println("enter the Location u want:\r\n");
				TLocation=scanner.nextLine();
				Tnum=0;
		 for(int i=0;i<Houses.size();i++) {
				if(Houses.get(i).Location.equals(TLocation)) {
				if(Houses.get(i).HouseFlag.equals("0")) { 
                  Tnum=Tnum+1;
					 System.out.println("done successfully\r\n");
					 Houses.get(i).HouseFlag="1";
					 TenantCpanel();
				}
				else if(Houses.get(i).HouseFlag.equals("1")) {
					 System.out.println("House is booked please try again \r\n");
					 TenantBook();
				}
				}
				
				}
	 }
	
	 public static void TenantCpanel() {
		 System.out.println( Tenants.get(Tnum2).show_member()+ "\r\n");
		 System.out.println( Houses.get(Tnum).show_House()+ "\r\n");
		 }
	 
	  public static void TenantActivity() {
			
			
			
		 
			
			System.out.println( "If u want to Book an house enter 1 \n\r");
			Scanner scanner = new Scanner(System.in);
			TOP=scanner.nextInt();
			while(!(TOP==1))
			{
				System.out.println( "input invalid  If u want to Book an house enter 1\n\r");
				TOP=scanner.nextInt();
				
			}
			TenantBook();	
	
			
		
	
	    }

	


}

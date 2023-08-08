package my_package;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Logger;


public class Main {
	public static Scanner input=new Scanner(System.in);
	public static final List <Admin>  Admins=new ArrayList<Admin> ();
	public static final List <Owner>  Owners=new ArrayList<Owner> ();
	public static final List <Tenant>  Tenants=new ArrayList<Tenant> ();
	public static final List <reservation> reservations =new ArrayList<reservation> ();
	public static final List <House>  Houses=new ArrayList<House> ();
	public static final List <request>  requests=new ArrayList<request> ();
	public static final Map <String,String> ads=new HashMap <String, String> ();
	public static final Map <String,String> owns=new HashMap <String, String> ();

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
		 logger = Logger.getLogger(Main.class.getName());

		init();
	 }
	public static void init() {
		Admin A1=new Admin("12345","pass1234","Raghad","raghad@gmail.com");
		Admins.add(A1);
		ads.put("Raghad", "pass1234");
		Owner O1=new Owner("223344","ahmad11","Ahmad","Ahmad@gmail.com","0599554828");
		Owners.add(O1);
		owns.put("Ahmad","ahmad11");
		Owner O2=new Owner("234234","Masa22","Masa","Masa@gmail.com","0594678453");
		Owners.add(O2);
		owns.put("Masa","Masa22");
		Owner O3=new Owner("123123","Layan33","Layan","Layan@gmail.com","0598345762");
		Owners.add(O3);
		owns.put("Layan","Layan33");
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
		logger.info("Enter your name:\r\n");
		 namee=input.next();
		 for(int i=0;i<ads.size();i++) {
				if(Admins.get(i).getName().equalsIgnoreCase(namee)) {
					//logger.info(LOGOUT);
					nameFlag=1;
					break;
				}
				else {
					logger.info("The user name is INVALID as an admin, please try again");
					admin_login();
				}
		 }
		 
		
		 while(passFlag==0) {
			 logger.info("Enter your password:\r\n");
			 password=input.next();
				if(ads.get(namee).equalsIgnoreCase(password)) {
					passFlag=1;
					break;
				}
				else {
					logger.info("The password is Incorrect,please try again");
					
				}
			
			
		}
		if(nameFlag==1 && passFlag==1) {
			AdminActivities();
		}
		
	}
	public static void owner_login() {
		int nameFlag=0;
		int passFlag=0;
		logger.info("Enter your name:\r\n");
		 namee=input.next();
		 for(int i=0;i<owns.size();i++) {
				if(Owners.get(i).getName().equalsIgnoreCase(namee)) {
					nameFlag=1;
					break;
				}
				else {
					logger.info("The user name is INVALID as an Owner, please try again");
					admin_login();
				}
		 }
		 
		
		 while(passFlag==0) {
			 logger.info("Enter your password:\r\n");
			 password=input.next();
				if(owns.get(namee).equalsIgnoreCase(password)) {
					passFlag=1;
					break;
				}
				else {
					logger.info("The password is Incorrect,please try again");
					
				}
			
			
		}
		if(nameFlag==1 && passFlag==1) {
			OwnerActivities();
		}
		
	}
	public static void AdminActivities() {

		int outt=0;
		logger.info("Welcome"+namee+".\r\n What do you want?\r\n ");
			while(outt==0) {
				logger.info("1-Show the list of houses owners.\r\n"
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
					logger.info("The owners are:\r\n");
					logger.info((i+1)+" Name: "+ Owners.get(i).name+"\t"+" Email: "+ Owners.get(i).email+"\t"+ " Phone: "+ Owners.get(i).phoneNum+"\n\r");
				}
			}
			break;
			case 2:
			{
				for(int i=0;i<Tenants.size();i++) {
					logger.info("The Tenants are:\r\n");
					logger.info((i+1)+" Name: "+ Tenants.get(i).name+"\t"+" Email: "+ Tenants.get(i).email+"\n\r");
				}
			}
			break;
			case 3:
			{
				for(int i=0;i<Houses.size();i++) {
					logger.info("The Houses are:\r\n");
					logger.info((i+1)+" Location: "+ Houses.get(i).location+"\t"+" Details: "+ Houses.get(i).details+"\t"+" Room number: "+ Houses.get(i).roomsNum+"\t"+" Student number: "+ Houses.get(i).studentNum+"\t"+" Price: "+ Houses.get(i).price+"\t"+" Owner name: "+ Houses.get(i).ownerName+"\t"+ Houses.get(i).houseFlag+"\t"+"\n\r");
				}
			}
			break;
			case 4:
			{
				for(int i=0;i<requests.size();i++) {
					logger.info("The pending requests are:\r\n");
					logger.info((i+1)+"House id:"+requests.get(i).id+"\t"+" Location: "+ requests.get(i).Location+"\t"+" Details: "+ requests.get(i).Details+"\t"+" Room number: "+ requests.get(i).rooms_num+"\t"+" Student number: "+ requests.get(i).student_num+"\t"+" Price: "+ requests.get(i).Price+"\t"+" Owner name: "+ requests.get(i).owner_name+"\t"+"\n\r");
					logger.info("\n\r Do you want to \n\r"
							+ "1- accept this request, so add the house to the app.\n\r"
							+ "2- reject the request\n\r ");
					int acc=input.nextInt();
					if(acc==1) {
						House hh=new House(requests.get(i).id,requests.get(i).Location,requests.get(i).rooms_num,requests.get(i).student_num,requests.get(i).Details,requests.get(i).Price,requests.get(i).owner_name,"0");
						Houses.add(hh);
						logger.info("\n\r The house added successfuly \n\r");
						
					}
					else if(acc==2) {
						logger.info("\n\r The house request removed \n\r ---------------\n\r");
					}
				}
				
			}
			break;
			case 5:
			{
				logger.info("What do you want to do?\n\r 1-delete a house \n\r 2-add a house");
				House h2=new House();
				int op=input.nextInt();
				if(op==1) {
					logger.info("choose the id of the house you want to delete\r\n");
					for(int i=0;i<Houses.size();i++) {
						
						logger.info((i+1)+" ID: "+ Houses.get(i).id+"\t"+" Location: "+ Houses.get(i).location+"\t"+" Details: "+ Houses.get(i).details+"\t"+" Room number: "+ Houses.get(i).roomsNum+"\t"+" Student number: "+ Houses.get(i).studentNum+"\t"+" Price: "+ Houses.get(i).price+"\t"+" Owner name: "+ Houses.get(i).ownerName+"\t"+"\n\r");
					}
					String ch=input.next();
					boolean x=h2.delete_house(ch);
				}
				if(op==2) {
					logger.info("Please, fill the information of the house you want to add\n\r");
					logger.info("\n\r ID:");
					String id=input.next();
					logger.info("\n\r Location:");
					String location=input.next();
					logger.info("\n\r Details:");
					String details=input.next();
					logger.info("\n\r Number of rooms:");
					int roomsNum=input.nextInt();
					logger.info("\n\r Number of students:");
					int students=input.nextInt();
					logger.info("\n\r Price:");
					String price=input.next();
					logger.info("\n\r Owner name:");
					String ownerName=input.next();
					h2.add_house(id, location, roomsNum, students, details, price, ownerName,"0");
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
			
			
    		
			
			
    		logger.info("\n Welcome to the Controlpanel for housing plz enter show houses!\r\n"
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
							logger.info(Houses.get(i).getId()+
								
		
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


						


						logger.info("fill the house ID");
						String a = id.next();
						
						logger.info("fill the location");
						String b=locat.nextLine();
						
						
						logger.info("fill the num of rooms");
						int c=rn.nextInt();
						
						
						logger.info("fill the num of students");
						int d=sn.nextInt();
						
						logger.info("fill the house details");
						String e=de.nextLine();
						
						logger.info("fill the price");
						String f=pr.nextLine();
						
						logger.info("fill the owner name");
						String g=on.nextLine();
						
						

						House ad = new House(a,b,c,d, e, f, g,"0");

						boolean addd=Operations.addH(ad);
						
						if(addd) {
							logger.info("A new House added");
						} else {
							logger.info("A House is already exist"); 
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
						
						logger.info("Enter a HOUSE ID you want to update:");
		                
		                String z = id1.next();
		                
		                logger.info("fill  the new house ID");
						String a1 = id1.next();
						
						logger.info("fill the new location");
						String b1=locat1.nextLine();
						
						
						logger.info("fill the new num of rooms");
						int c1=rn1.nextInt();
						
						
						logger.info("fill the  new num of students");
						int d1=sn1.nextInt();
						
						logger.info("fill the new house details");
						String e1=de1.nextLine();
						
						logger.info("fill the  new price");
						String f1=pr1.nextLine();
						
						logger.info("fill the new owner name");
						String g1=on1.nextLine();
		                
		                
		                
		                
		                boolean update = Operations.updateH(z,a1,b1,c1,d1, e1, f1, g1,"0");
		                
		                if (!update)
		                	logger.info("A House was updated");
		                else
		                	logger.info("A House was not exist");
		                break;
						
					
						
					
					case 4:
						
						int index = -1;
		                Scanner id2 = new Scanner(System.in);
		                
		                logger.info("Enter the house ID you want to delete:");
		                String z1 = id2.next();
		                
		                for (int i = 0; i < Main.Houses.size(); i++) {
		                	
		                    if (Main.Houses.get(i).getId().equals(z1)) 
		                    {
		                        index = i;
		                    }
		                }
		                if (index == -1) {
		                	logger.info("A house you want to delete does not exist");
		                } else {
		                    boolean delete = Operations.deleteH(Main.Houses.get(index));
		                    if (!delete)
		                    	logger.info("A house was deleted");	       
		                }


						
						
						
						break;
						
						
						
					//case :
						
						
						
						
						
						
				
						
					case 5:
					
					    Scanner id3 = new Scanner(System.in);
					    logger.info("Enter the house ID to know the number of students:");
					    String houseId = id3.next();
					    
					    House targetHouse = null;
					    for (House house : Main.Houses) {
					        if (house.getId().equals(houseId)) {
					            targetHouse = house;
					            break;
					        }
					    }
					    
					    if (targetHouse != null) {
					    	logger.info("House ID: " + targetHouse.getId() +
					                    ", Number of Students: " + targetHouse.getStudentNum());
					    } else {
					    	logger.info("House with ID " + houseId + " not found.");
					    }
					    break;
						
					
		                
		            	
					case 6:
						
						
						
						
						  Scanner id4 = new Scanner(System.in);
						  logger.info("Enter the house ID to show more details:");
						    String houseId2 = id4.next();
						    
						    House targetHouse2 = null;
						    for (House house : Main.Houses) {
						        if (house.getId().equals(houseId2)) {
						            targetHouse2 = house;
						            break;
						        }
						    }
						    
						    if (targetHouse2 != null) {
						       
						      
						    	logger.info("Number of Rooms: " + targetHouse2.getRoomsNum());
						        
						       
						    	logger.info("Details: " + targetHouse2.getDetails());
						    	logger.info("Price: " + targetHouse2.getPrice());
						      
						    } else {
						    	logger.info("House with ID " + houseId2 + " not found.");
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
		 logger.info(" To log in to  S A K A N C O M enter  Your email and password \n\r"
					+ "enter your email\n\r");
			Temail=scanner.nextLine();
			logger.info("enter your pass\n\r");
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
			        	logger.info("The password is incorrect, please try again");
			            LoginTenant(); 
			        }
			    }
			}

			if (!emailFound) {
				logger.info("The email is INVALID, please try again");
			    LoginTenant(); 
			}

				
			
			if (flag==1)
			{
				Tenantview();
				
			}
			
			
			
	 }
	  public static void Tenantview()

	 {logger.info("The Houses are:\r\n");
		 for(int i=0;i<Houses.size();i++) {
				
				if(Houses.get(i).houseFlag.equals("1")) {
					logger.info((i)+" Location: "+ Houses.get(i).location+"\t"+" Details: "+ Houses.get(i).details+"\t"+" Room number: "+ Houses.get(i).roomsNum+"\t"+" Student number: "+ Houses.get(i).studentNum+"\t"+" Price: "+ Houses.get(i).price+"\t"+" Owner name: "+ Houses.get(i).ownerName+"\t" + "booked up"+"\t" +"\n\r");
			}
				else if (Houses.get(i).houseFlag.equals("0"))
				{
					logger.info((i)+" Location: "+ Houses.get(i).location+"\t"+" Details: "+ Houses.get(i).details+"\t"+" Room number: "+ Houses.get(i).roomsNum+"\t"+" Student number: "+ Houses.get(i).studentNum+"\t"+" Price: "+ Houses.get(i).price+"\t"+" Owner name: "+ Houses.get(i).ownerName+"\t" + "available "+"\t" +"\n\r");
				}
				}
		 TenantActivity();
				}
	 public static void TenantBook() {
		 Scanner scanner = new Scanner(System.in);
		 logger.info("enter the Location u want:\r\n");
				TLocation=scanner.nextLine();
				Tnum=0;
		 for(int i=0;i<Houses.size();i++) {
				if(Houses.get(i).location.equals(TLocation)) {
				if(Houses.get(i).houseFlag.equals("0")) { 
                  Tnum=Tnum+1;
                  logger.info("done successfully\r\n");
					 Houses.get(i).houseFlag="1";
					 TenantCpanel();
				}
				else if(Houses.get(i).houseFlag.equals("1")) {
					logger.info("House is booked please try again \r\n");
					 TenantBook();
				}
				}
				
				}
	 }
	
	 public static void TenantCpanel() {
		 logger.info( Tenants.get(Tnum2).show_member()+ "\r\n");
		 logger.info( Houses.get(Tnum).show_House()+ "\r\n");
		 }
	 
	  public static void TenantActivity() {
			
			
			
		 
			
		  logger.info( "If u want to Book an house enter 1 \n\r");
			Scanner scanner = new Scanner(System.in);
			TOP=scanner.nextInt();
			while(!(TOP==1))
			{
				logger.info( "input invalid  If u want to Book an house enter 1\n\r");
				TOP=scanner.nextInt();
				
			}
			TenantBook();	
	
			
		
	
	    }

	


}

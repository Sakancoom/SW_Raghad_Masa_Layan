package my_package;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;


public class Main {
	protected static final Scanner input=new Scanner(System.in);
	public static final List <Admin>  Admins=new ArrayList<Admin> ();
	public static final List <Owner>  Owners=new ArrayList<Owner> ();
	public static final List <Tenant>  Tenants=new ArrayList<Tenant> ();
	public static final List <Reservation> reservations =new ArrayList<Reservation> ();
	public static final List <House>  Houses=new ArrayList<House> ();
	public static final List <Request>  requests=new ArrayList<Request> ();
	public static final Map <String,String> ads=new HashMap <String, String> ();
	public static final Map <String,String> owns=new HashMap <String, String> ();

	protected static  String namee="";
	private static  String password="";
	public static final  String INVALID="Invalid choice. Please try again.";
	   

    protected static int y;
    public static final  String LOGOUT="You are logged out.";
    public static final  String DEC="%d - ";
    
    protected static Logger logger;
    public static final String NOTE="The Username doesn't exist, please enter your Username again";
    static String tenantEmail; 
	static String tenantPass;
	static String tenantLocation;
	static int tenantNum;
	static int tenantNum2;
	static int tenantOp;
	public static void main(String [] args) {
		 logger = Logger.getLogger(Main.class.getName());

		init();
	 }
	public static void init() {
		Admin a1=new Admin("12345","pass1234","Raghad","raghad@gmail.com");
		Admins.add(a1);
		ads.put("Raghad", "pass1234");
		Owner o1=new Owner("223344","ahmad11","Ahmad","Ahmad@gmail.com","0599554828");
		Owners.add(o1);
		owns.put("Ahmad","ahmad11");
		Owner o2=new Owner("234234","Masa22","Masa","Masa@gmail.com","0594678453");
		Owners.add(o2);
		owns.put("Masa","Masa22");
		Owner o3=new Owner("123123","Layan33","Layan","Layan@gmail.com","0598345762");
		Owners.add(o3);
		owns.put("Layan","Layan33");
		Tenant t1=new Tenant("2001","alaa200","Alaa","Alaa@gmail.com");
		Tenants.add(t1);
		Tenant t2=new Tenant("2002","Hiba99","Hiba","Hiba@gmail.com");
		Tenants.add(t2);
		Tenant t3=new Tenant("2002","Rania14","Rania","Rania.com");
		Tenants.add(t3);
		Request r1=new Request("234","Nablus",5,3,"without balkon","120","Ali");
		requests.add(r1);
		Request r2=new Request("7484","Nablus",5,4,"Third floor","120","Rasem");
		requests.add(r2);
		House h1=new House("2033","RasAlain",4,3,"first floor","100","Layan Othman","1");
		Houses.add(h1);
		House h2=new House("2024","BaitWazan",6,4,"With 4 bed rooms","130","lara ahmad","0");
		Houses.add(h2);
		
		
	start();	
	}
	public static void start() {
		logger.info("Welcome to S A K A N C O M :)\n\r");
		logger.info("Are you an:\n\r"
				+ "1.Admin.\n\r"
				+ "2.House Owner.\n\r"
				+ "3.Tenant.\n\r");
		int role=input.nextInt();
		if(role==1) {
			loginAdmin();
		}
		else if(role==2) {
			loginOwner();
		}
		else if(role==3) {
			loginTenant();
		}
		else {
			start();
		}
		
		
	}
	public static void loginAdmin() {
		int isName=0;
		int isPass=0;
		logger.info("Enter your name:\r\n");
		 namee=input.next();
		 for(int i=0;i<ads.size();i++) {
				if(Admins.get(i).getName().equalsIgnoreCase(namee)) {
					
					isName=1;
					break;
				}
				else {
					logger.info("The user name is INVALID as an admin, please try again");
					loginAdmin();
				}
		 }
		 
		
		 while(isPass!=1) {
			 logger.info("Enter your password:\r\n");
			 password=input.next();
				if(ads.get(namee).equalsIgnoreCase(password)) {
					isPass=1;
					break;
				}
				else {
					logger.info("The password is Incorrect,please try again");
					
				}
			
			
		}
		if(isName==1 && isPass==1) {
			adminActivities();
		}
		
	}
	public static void loginOwner() {
		int isName=0;
		int isPass=0;
		logger.info("Enter your name:\r\n");
		 namee=input.next();
		 for(int i=0;i<owns.size();i++) {
				if(Owners.get(i).getName().equalsIgnoreCase(namee)) {
					isName=1;
					break;
				}
				else {
					logger.info("The user name is INVALID as an Owner, please try again");
					loginOwner();
				}
		 }
		 
		
		 while(isPass!=1) {
			 logger.info("Enter your password:\r\n");
			 password=input.next();
				if(owns.get(namee).equalsIgnoreCase(password)) {
					isPass=1;
					break;
				}
				else {
					logger.info("The password is Incorrect,please try again");
					
				}
			
			
		}
		if(isName==1 && isPass==1) {
			ownerActivities();
		}
		
	}
	public static void adminActivities() {

		int outt=0;
		String format;
		format=String.format("Welcome Admin %s.%n What do you want?%n ", namee);
		logger.info(format);
			while(outt==0) {
				logger.info("1-Show the list of houses owners.\r\n"
					+ "2-Show the list of the application users.\r\n"
					+ "3-Show the list of all houses in the application.\r\n"
					+ "4-Show the request of adding houses from the owners.\r\n"
					+ "5-Modify existing houses info.\r\n"
					+ "6-Show A REPORT about all reservations via the app.\r\n"
					+"7-Log Out\r\n");
			int choice=input.nextInt();
			switch(choice) {
			case 1:
			{
				for(int i=0;i<Owners.size();i++) {
					format=String.format("Name: %s   Email: %s  Phone: %s  %n", Owners.get(i).name,Owners.get(i).email,Owners.get(i).phoneNum);
					logger.info("The owners are:\r\n");
					logger.info(format);
				}
			}
			break;
			case 2:
			{
				for(int i=0;i<Tenants.size();i++) {
					format=String.format("Name: %s   Email: %s  %n", Tenants.get(i).name,Tenants.get(i).email); 
					logger.info("The Tenants are:\r\n");
					logger.info(format);
				}
			}
			break;
			case 3:
			{
				for(int i=0;i<Houses.size();i++) {
					logger.info("The Houses are:\r\n");
					format=String.format("Location: %s  Details:%s Room number:%s Student number:%s  Price:%s Owner name:%s  %n", Houses.get(i).location,Houses.get(i).details,Houses.get(i).roomsNum,Houses.get(i).studentNum,Houses.get(i).price,Houses.get(i).ownerName); 
					logger.info(format);
				
				}
			}
			break;
			case 4:
			{
				for(int i=0;i<requests.size();i++) {
					format=String.format("Location: %s  Details:%s Room number:%s Student number:%s  Price:%s Owner name:%s  %n", requests.get(i).location,requests.get(i).details,requests.get(i).roomsNum,requests.get(i).studentNum,requests.get(i).price,requests.get(i).ownerName); 
				
					logger.info("The pending requests are:\r\n");
					logger.info(format);
					logger.info("\n\r Do you want to \n\r"
							+ "1- accept this request, so add the house to the app.\n\r"
							+ "2- reject the request\n\r ");
					int acc=input.nextInt();
					if(acc==1) {
						House hh=new House(requests.get(i).id,requests.get(i).location,requests.get(i).roomsNum,requests.get(i).studentNum,requests.get(i).details,requests.get(i).price,requests.get(i).ownerName,"0");
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
						
						format=String.format("ID: %s Location: %s  Details:%s Room number:%s Student number:%s  Price:%s Owner name:%s  %n",Houses.get(i).location, Houses.get(i).location,Houses.get(i).details,Houses.get(i).roomsNum,Houses.get(i).studentNum,Houses.get(i).price,Houses.get(i).ownerName); 
						logger.info(format);
					
					}
					String ch=input.next();
					for(int y=0;y<Main.Houses.size();y++) {
						if ((Main.Houses.get(y).id).equals(ch))
						{
							Main.Houses.remove(y);
							
						}
					}
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
					h2.addHouse(id, location, roomsNum, students, details, price, ownerName,"0");
				}
			
			}
			break;
			case 6:
			{
				Report.generateReport();
				
			}
			break;
			case 7:
			{
				start();
			}
			break;
			
			default:adminActivities();
			}
			}
			
		
	
	}
    public static void ownerActivities() {
    int outt=0;
    	while(outt==0) {
			
	
    		logger.info("\n Welcome to the Controlpanel for housing plz enter show houses!\r\n"
					+"--------------------------------------------------"
					+"Please select an option from the following menu:\r\n"
					+"1.show houses(id ,locations)\r\n"
					+"2.add new house(the request is pending until the admin approve it) \r\n"
					+"3.Update an existing house \r\n"
					+"4.delete house \r\n"
					+"5.Please enter the id of the house that you want to know it's number of students(tenant)\r\n"
					+"6.Show more details of specific house \r\n"
					+"7.LogOut\r\n"
					+"8.Quit\r\n"
					+"Enter the number of the activity you want to perform:\r\n");
					
				int choice;
				
				choice=input.nextInt();
				

				switch(choice) {
					case 1:
						
						
						for(int i=0;i<Houses.size();i++) {

							logger.info(Houses.get(i).getId()+"    "+ Houses.get(i).getLocation()+ "\r\n");
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

						boolean isAdded=Operations.addH(ad);
						
						if(isAdded) {
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
		                
		                
		                
		                
		                boolean isUpdate = Operations.updateH(z,a1,b1,c1,d1, e1, f1, g1,"0");
		                
		                if (!isUpdate)
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
		                    boolean isDeleted = Operations.deleteH(Main.Houses.get(index));
		                    if (!isDeleted)
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
					    	String format=String.format("House with ID %s  not found.", houseId);
					    	logger.info(format);
					    
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
						    	String format=String.format("House with ID %s  not found.", houseId2);
						    	logger.info(format);
						    }
						    break;
						
					
		            	
					case 7:
						
				
				start();
				break;

					case 8:
						System.exit(0);
		            	break;
					default:ownerActivities();


		           
		
				}}
	}
    
    
	
	 public  static void loginTenant()
	 {
		 Scanner scanner = new Scanner(System.in);
		 int flag=0;
		 
		 logger.info(" To log in to  S A K A N C O M enter  Your email and password \n\r"
					+ "enter your email\n\r");
		 tenantEmail=scanner.nextLine();
			logger.info("enter your pass\n\r");
			tenantPass=scanner.nextLine();
			tenantNum2=0;
			boolean isEmailFound = false;
			for (int i = 0; i < Tenants.size(); i++) {
			    if (Tenants.get(i).email.equalsIgnoreCase(tenantEmail)) {
			        if (Tenants.get(i).password.equalsIgnoreCase(tenantPass)) {
			            flag = 1;
			            tenantNum2 = tenantNum2 + 1;
			            isEmailFound = true;
			            break;
			        } else {
			        	logger.info("The password is incorrect, please try again");
			            loginTenant(); 
			        }
			    }
			}

			if (!isEmailFound) {
				logger.info("The email is INVALID, please try again");
			    loginTenant(); 
			}

				
			
			if (flag==1)
			{
				tenantView();
				
			}
			
			
			scanner.close();	
	 }
	  public static void tenantView()

	 {
		  String ff;
		  logger.info("The Houses are:\r\n");
		 for(int i=0;i<Houses.size();i++) {
				
				if(Houses.get(i).houseFlag.equals("1")) {
					
					ff=String.format("Location: %s  Details:%s Room number:%s Student number:%s  Price:%s Owner name:%s  booked up %n", Houses.get(i).location,Houses.get(i).details,Houses.get(i).roomsNum,Houses.get(i).studentNum,Houses.get(i).price,Houses.get(i).ownerName); 
					logger.info(ff);
					}
				else if (Houses.get(i).houseFlag.equals("0"))
				{
					ff=String.format("Location: %s  Details:%s Room number:%s Student number:%s  Price:%s Owner name:%s  Available %n", Houses.get(i).location,Houses.get(i).details,Houses.get(i).roomsNum,Houses.get(i).studentNum,Houses.get(i).price,Houses.get(i).ownerName); 
					logger.info(ff);
				
				}
				}
		 tenantActivity();
				}
	 public static void tenantBook() {
		 Scanner scanner = new Scanner(System.in);
		 logger.info("enter the Location u want:\r\n");
		 tenantLocation=scanner.nextLine();
		 tenantNum=0;
		 for(int i=0;i<Houses.size();i++) {
				if(Houses.get(i).location.equals(tenantLocation)) {
				if(Houses.get(i).houseFlag.equals("0")) { 
					tenantNum=tenantNum+1;
                  logger.info("done successfully\r\n");
					 Houses.get(i).houseFlag="1";
					 tenantCpanel();
				}
				else if(Houses.get(i).houseFlag.equals("1")) {
					logger.info("House is booked please try again \r\n");
					 tenantBook();
				}
				}
				
				}
		 scanner.close();
	 }
	
	 public static void tenantCpanel() {
		 String f1= String.format("% s   %n", Tenants.get(tenantNum2).showMember());
		 String f2= String.format("% s   %n", Tenants.get(tenantNum).showMember());
		 logger.info( f1);
		 logger.info( f2);
		 }
	 
	  public static void tenantActivity() {
			
			
			
		 
			
		  logger.info( "If u want to Book an house enter 1 \n\r");
			Scanner scanner = new Scanner(System.in);
			tenantOp=scanner.nextInt();
			while(tenantOp!=1)
			{
				logger.info( "input invalid  If u want to Book an house enter 1\n\r");
				tenantOp=scanner.nextInt();
				
			}
			tenantBook();	
	
			scanner.close();
		
	
	    }

	


}

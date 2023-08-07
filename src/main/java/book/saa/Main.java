package book.saa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main {
	public static ArrayList <Tenant>  Tenants=new ArrayList<Tenant> ();
	public static ArrayList <House>  Houses=new ArrayList<House> ();
	static String Temail; 
	static String Tpass;
	static String TLocation;
	static int Tnum;	static int Tnum2; static int TOP;
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
	 
	  public static void main(String[] args) {
			Tenant T1=new Tenant("2001","alaa200","Alaa","Alaa@gmail.com");
			Tenants.add(T1);
		
			Tenant T2=new Tenant("50","masa1234","Masa Yaseen","masayaseen1@gmail.com");
			Tenants.add(T2);
			
			House h1=new House("2033","RasAlain",4,3,"first floor","100","Layan Othman","1");
			Houses.add(h1);
			House h2=new House("2024","BaitWazan",6,4,"with balkon","130","lara ahmad","0");
			Houses.add(h2);
		 
			LoginTenant();
			Tenantview();
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
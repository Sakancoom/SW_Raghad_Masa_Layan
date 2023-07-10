import java.util.ArrayList;
import java.util.*;

public class Main {
	public static Scanner input=new Scanner(System.in);
	public static ArrayList <Admin>  Admins=new ArrayList<Admin> ();
	public static ArrayList <Owner>  Owners=new ArrayList<Owner> ();
	public static ArrayList <Tenant>  Tenants=new ArrayList<Tenant> ();
	public static ArrayList <House>  Houses=new ArrayList<House> ();
	public static void main(String [] args) {
		 init();
		 
	 }
	public static void init() {
		Admin A1=new Admin("12345","pass1234","Raghad Matar","raghad@gmail.com");
		Admins.add(A1);
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
	public static void AdminActivities() {
		
	}
    public static void OwnerActivities() {
		
	}
    public static void TenantActivities() {
		
	}

}

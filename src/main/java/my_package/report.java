package my_package;

public class report {

	public report(int x) {
		super();
		this.x = x;
	}

	int x=1;
	public static void generate_report() {
		System.out.println("Here is all reservations via the app\n\r");
		for(int i=0;i<Main.reservations.size();i++) {
			System.out.println((i+1)+"the user "+ Main.reservations.get(i).User_name + "reserved a house which owned by: "+ Main.reservations.get(i).Owner_name+"\n\r");
			System.out.println("The price of this house is: "+ Main.reservations.get(i).h1.Price+"\n\r");
		}
	}
}

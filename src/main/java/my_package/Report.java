package my_package;

import java.util.logging.Logger;
public class Report {
	protected static Logger logger = Logger.getLogger(Report.class.getName());
	public Report(int x) {
		super();
		this.x = x;
	}

	int x=1;
	public static void generateReport() {
		logger.info("Here is all reservations via the app\n\r");
		for(int i=0;i<Main.reservations.size();i++) {
			logger.info((i+1)+"the user "+ Main.reservations.get(i).userName + "reserved a house which owned by: "+ Main.reservations.get(i).ownerName+"\n\r");
			logger.info("The price of this house is: "+ Main.reservations.get(i).h1.price+"\n\r");
		}
	}
}
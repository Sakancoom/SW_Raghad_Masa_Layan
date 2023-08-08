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
		String fh;
		logger.info("Here is all reservations via the app\n\r");
		for(int i=0;i<Main.reservations.size();i++) {
			fh=String.format("The user %s reserved a house which owned by: %s %n", Main.reservations.get(i).userName,Main.reservations.get(i).ownerName);
			logger.info(fh);
			fh=String.format("The price of this house is: %s ",  Main.reservations.get(i).h1.price);
			logger.info(fh);
			
		}
	}
}

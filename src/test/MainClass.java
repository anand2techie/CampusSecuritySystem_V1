package test;

public class MainClass {

	public static void main(String[] args) {
		CampusSecurity campusSecurity = new CampusSecurity();
		
		//do this for every 'n' seconds, showing that display changes every time
		campusSecurity.alertsChanged(getNewAlertData());
		showDisplay(campusSecurity);
	}

	private static void showDisplay(CampusSecurity campusSecurity) {
		// TODO Auto-generated method stub
		System.out.println(campusSecurity.getWeatherData());
		System.out.println(campusSecurity.getNationalAlert());
		System.out.println(campusSecurity.getCampusAlert());
	}

	//call this method every 5 seconds
	static String[] getNewAlertData() {
		// write the code to get the new alert data from a collection. Collection should
		// have the sample alert data dump (may be, 10 alert data for instance)
		
		//array is for example, use a better DS
		return new String[]{"Weather is hot","color level is high","Be safe! Don't go outside!"};
		
	}

}

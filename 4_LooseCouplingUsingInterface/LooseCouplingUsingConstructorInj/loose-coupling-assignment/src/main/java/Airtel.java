
public class Airtel {

	private Service service;
	
	public Airtel(Service service) {
		this.service = service;
	}
	
	public void displayService() {
		service.service();
	}
}

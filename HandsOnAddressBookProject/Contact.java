package HandsOnAddressBookProject;

public class Contact {

	//var
	private String name;
	private int phoneNumber;
	private String address;
	
	
	
	//Getters/Setters methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//def constr
	Contact(){
		
	}
	
	// user defined constr
	public Contact(String name, int phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//toString
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
	
	
	
	
}

public class Executor {

	public static void main(String[] args) {
	Address address=new Address("Sharda nagar", "Pune", "Maharashtra", "4110001");
	
	
		Person p=new Person("Aniket", address);
		p.displayInfo();
		System.out.println(p);}}
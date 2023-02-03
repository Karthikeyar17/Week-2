package Week_2;

class Static_2 {
	private static int counter;
	private String registrationId;
	private String name;
	private String city;
	private long contact_num;
	static {
		counter=10000;
	}
	public Static_2(String name, long contact_num,String city)
	{
		this.registrationId="D"+ ++Static_2.counter;
		this.name=name;
		this.contact_num=contact_num;
		this.city=city;
				
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Static_2.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	

public static void main(String[] args) {
Static_2 participant1 = new Static_2("Franklin", 7656784323L, "Texas");
Static_2 participant2 = new Static_2("Merina", 7890423112L, "New York");

Static_2[] participants = { participant1, participant2 };
for (Static_2 participant : participants) {
System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
}
}
}


